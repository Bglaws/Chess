import java.io.PrintWriter;
import java.util.ArrayList;

public class Board {
	static PrintWriter printWriter = new PrintWriter(System.out);
	public static ArrayList<Piece> black = new ArrayList<Piece>();
	public static ArrayList<Piece> white = new ArrayList<Piece>();

	static Piece board[][] = new Piece[8][8];

	static void printBoard() {
		System.out.println("    a   b   c   d   e   f   g   h");

		System.out.println("  ---------------------------------");
		int count = 8;
		for (int i = 0; i < 8; i++) {
			System.out.print(count + " ");
			System.out.print("| ");
			for (int j = 0; j < 8; j++) {
				if (board[i][j] == null) {
					System.out.print("  | ");
				} else {
					System.out.print(board[i][j] + " | ");
					// printWriter.print(board[i][j] + " | ");
					// printWriter.flush();
				}
			}
			System.out.print(count);
			count--;
			System.out.println();
			System.out.println("  ---------------------------------");
		}
		System.out.println("    a   b   c   d   e   f   g   h");
		System.out.println();
	}

	static void startGame() {
		System.out.println("How to play:");
		System.out.println("For pawns, type in \"pawn\" followed by the file letter");
		System.out.println("For bishops, knights and rooks, put \"Q\" or \"K\" to specify Queen's or King's side");
		System.out.println("provide a space and then enter a valid tile. For example, pawnA a4");
		System.out.println("Pawns auto-promote to queens. The new queens are referenced by what the pawns file was");
		System.out.println("To castle, type castle, followed by a space and then a capital K or Q to specify a side\n");

		// black
		Rook rook1 = new Rook(Color.BLACK, "rookQ", 0, 0);
		Knight knight1 = new Knight(Color.BLACK, "knightQ", 1, 0);
		Bishop bishop1 = new Bishop(Color.BLACK, "bishopQ", 2, 0);
		Queen queen1 = new Queen(Color.BLACK, "queen", 3, 0);
		King king1 = new King(Color.BLACK, "king", 4, 0);
		Bishop bishop2 = new Bishop(Color.BLACK, "bishopK", 5, 0);
		Knight knight2 = new Knight(Color.BLACK, "knightK", 6, 0);
		Rook rook2 = new Rook(Color.BLACK, "rookK", 7, 0);

		Pawn pawn1 = new Pawn(Color.BLACK, "pawnA", 0, 1);
		Pawn pawn2 = new Pawn(Color.BLACK, "pawnB", 1, 1);
		Pawn pawn3 = new Pawn(Color.BLACK, "pawnC", 2, 1);
		Pawn pawn4 = new Pawn(Color.BLACK, "pawnD", 3, 1);
		Pawn pawn5 = new Pawn(Color.BLACK, "pawnE", 4, 1);
		Pawn pawn6 = new Pawn(Color.BLACK, "pawnF", 5, 1);
		Pawn pawn7 = new Pawn(Color.BLACK, "pawnG", 6, 1);
		Pawn pawn8 = new Pawn(Color.BLACK, "pawnH", 7, 1);

		// white
		Rook rook3 = new Rook(Color.WHITE, "rookQ", 0, 7);
		Knight knight3 = new Knight(Color.WHITE, "knightQ", 1, 7);
		Bishop bishop3 = new Bishop(Color.WHITE, "bishopQ", 2, 7);
		Queen queen2 = new Queen(Color.WHITE, "queen", 3, 7);
		King king2 = new King(Color.WHITE, "king", 4, 7);
		Bishop bishop4 = new Bishop(Color.WHITE, "bishopK", 5, 7);
		Knight knight4 = new Knight(Color.WHITE, "knightK", 6, 7);
		Rook rook4 = new Rook(Color.WHITE, "rookK", 7, 7);

		Pawn pawn9 = new Pawn(Color.WHITE, "pawnA", 0, 6);
		Pawn pawn10 = new Pawn(Color.WHITE, "pawnB", 1, 6);
		Pawn pawn11 = new Pawn(Color.WHITE, "pawnC", 2, 6);
		Pawn pawn12 = new Pawn(Color.WHITE, "pawnD", 3, 6);
		Pawn pawn13 = new Pawn(Color.WHITE, "pawnE", 4, 6);
		Pawn pawn14 = new Pawn(Color.WHITE, "pawnF", 5, 6);
		Pawn pawn15 = new Pawn(Color.WHITE, "pawnG", 6, 6);
		Pawn pawn16 = new Pawn(Color.WHITE, "pawnH", 7, 6);
	}

	// set piece to provided coordinates
	public static void setPiece(int x, int y, Piece piece) {
		if (piece != null) {
			piece.setX(x);
			piece.setY(y);
		}
		board[y][x] = piece;
	}

	// check spot on board
	public static Piece getPiece(int x, int y) {
		return board[y][x];
	}

	// match String piece from user with Piece on board
	public static Piece getPiece(String piece, Color color) {

		if (color == Color.WHITE) {

			for (int i = 0; i < white.size(); i++) {
				Piece p = white.get(i);
				if (p.matchID(piece)) {
					return p;
				}
			}
		}

		else if (color == Color.BLACK) {

			for (int i = 0; i < black.size(); i++) {
				Piece p = black.get(i);
				if (p.matchID(piece)) {
					return p;
				}
			}
		}

		return null;

	}

	// HERE is path clear not working!!!
	public static boolean isPathClear(int x1, int y1, int x2, int y2) {

		int xDistance = x2 - x1;
		int yDistance = y2 - y1;
		int xDir = 0;
		int yDir = 0;
		int size = 0;

		if (xDistance < 0) {
			xDir = -1;
		} else if (xDistance > 0) {
			xDir = 1;
		}

		if (yDistance < 0) {
			yDir = -1;
		} else if (yDistance > 0) {
			yDir = 1;
		}

		if (xDistance != 0) {
			size = Math.abs(xDistance) - 1;
		} else {
			size = Math.abs(yDistance) - 1;
		}
		// change on x and y

		for (int i = 0; i < size; i++) {
			x1 += xDir;
			y1 += yDir;

			if (getPiece(x1, y1) != null) {
				return false;
			}
		}
		return true;

	}

	static int processMove(String move, Color color) {

		String[] splitStr = move.split(" ");
		String piece = splitStr[0];

		if (piece.equals("castle")) {
			King king = (King) getPiece("king", color);
			return king.castle(splitStr[1]);
		}

		// piece selected to move
		Piece p = getPiece(piece, color);
		if (p == null) {
			System.out.println("invalid piece, please type in piece to move it.");
			return -1;
		}

		String coordinates = splitStr[1];
		if (coordinates.length() != 2) {
			System.out.println("Invalid Tile please try again");
			return -1;
		}

		int file = coordinates.charAt(0) - 'a'; // y
		int rank = 7 - (coordinates.charAt(1) - '1'); // x

		if (rank < 0 || rank > 7 || file < 0 || file > 7) {
			System.out.println("Invalid Tile please try again");
			return -1;
		}

		// piece at destination
		Piece other = getPiece(file, rank);

		return p.move(file, rank, other, color);

	}

	public static boolean checkForCheck(Color color) {

		Piece king = getPiece("king", color);

		if (color == Color.WHITE) {
			for (int i = 0; i < black.size(); i++) {
				Piece p = black.get(i);
				if (p.possibleMove(king.getX(), king.getY())) {
					System.out.println("king in check");
					return true;
				}
			}
		}

		else if (color == Color.BLACK) {
			for (int i = 0; i < white.size(); i++) {
				Piece p = white.get(i);
				if (p.possibleMove(king.getX(), king.getY())) {
					return true;
				}
			}
		}

		return false;
	}

	public static boolean checkForCheckmate() {

		return false;

	}

	public static boolean staleMate() {
		return false;
		/*
		 * 3 ways to stalemate: insufficient material (not enough firepower), no legal
		 * moves, and three-fold repetition. Well, there’s one more – 50 king moves with
		 * no other legal moves – but this almost never occurs outside of scholastic
		 * tournaments.
		 */
	}

}
