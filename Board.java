
import java.util.ArrayList;

public class Board {

	public static ArrayList<Piece> black = new ArrayList<Piece>();
	public static ArrayList<Piece> white = new ArrayList<Piece>();

	static Piece board[][] = new Piece[8][8];
//	[][] board = {{" ", " ", " ", " ", " ", " ", " ", " "},   
//							{" ", " ", " ", " ", " ", " ", " ", " "},	
//							{" ", " ", " ", " ", " ", " ", " ", " "},	 
//							{" ", " ", " ", " ", " ", " ", " ", " "},	 
//							{" ", " ", " ", " ", " ", " ", " ", " "},	 
//							{" ", " ", " ", " ", " ", " ", " ", " "},	 
//							{" ", " ", " ", " ", " ", " ", " ", " "},	 
//							{" ", " ", " ", " ", " ", " ", " ", " "}};   
//							  a    b    c    d    e    f    g    h

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
				}
				else {
					System.out.print(board[i][j] + " | ");
				}
			}
			System.out.print(count);
			count--;
			System.out.println();
			System.out.println("  ---------------------------------");
		}
		System.out.println("    a   b   c   d   e   f   g   h");
	}
	
	
	static void startGame() {

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
		// ArrayList index
		black.add(rook1);
		board[0][0] = rook1; // 0
		black.add(knight1);
		board[0][1] = knight1; // 1
		black.add(bishop1);
		board[0][2] = bishop1; // 2
		black.add(queen1);
		board[0][3] = queen1; // 3
		black.add(king1);
		board[0][4] = king1; // 4
		black.add(bishop2);
		board[0][5] = bishop2; // 5
		black.add(knight2);
		board[0][6] = knight2; // 6
		black.add(rook2);
		board[0][7] = rook2; // 7

		black.add(pawn1);
		board[1][0] = pawn1; // 8
		black.add(pawn2);
		board[1][1] = pawn2; // 9
		black.add(pawn3);
		board[1][2] = pawn3; // 10
		black.add(pawn4);
		board[1][3] = pawn4; // 11
		black.add(pawn5);
		board[1][4] = pawn5; // 12
		black.add(pawn6);
		board[1][5] = pawn6; // 13
		black.add(pawn7);
		board[1][6] = pawn7; // 14
		black.add(pawn8);
		board[1][7] = pawn8; // 15

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
		// ArrayList index
		white.add(rook3);
		board[7][0] = rook3; // 0
		white.add(knight3);
		board[7][1] = knight3; // 1
		white.add(bishop3);
		board[7][2] = bishop3; // 2
		white.add(queen2);
		board[7][3] = queen2; // 3
		white.add(king2);
		board[7][4] = king2; // 4
		white.add(bishop4);
		board[7][5] = bishop4; // 5
		white.add(knight4);
		board[7][6] = knight4; // 6
		white.add(rook4);
		board[7][7] = rook4; // 7

		white.add(pawn9);
		board[6][0] = pawn9; // 8
		white.add(pawn10);
		board[6][1] = pawn10; // 9
		white.add(pawn11);
		board[6][2] = pawn11; // 10
		white.add(pawn12);
		board[6][3] = pawn12; // 11
		white.add(pawn13);
		board[6][4] = pawn13; // 12
		white.add(pawn14);
		board[6][5] = pawn14; // 13
		white.add(pawn15);
		board[6][6] = pawn15; // 14
		white.add(pawn16);
		board[6][7] = pawn16; // 15
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

		// Major and Minor pieces

		if (color == Color.WHITE) {

			for (int i = 0; i < white.size(); i++) {
				Piece p = white.get(i);
				if (p.matchID(piece)) {
					return p;
				}
			}
		}

		else if (color == Color.BLACK) {

			for (int i = 0; true; i++) {
				Piece p = black.get(i);
				if (p.matchID(piece)) {
					return p;
				}
			}
		}

		return null;

	}
	
	

	static int processMove(String move, Color color) {

		String[] splitStr = move.split(" ");
		String piece = splitStr[0];
		
		//piece selected to move
		Piece p = getPiece(piece, color);
		if (p == null) {
			System.out.println("invalid piece, please type in piece to move it.");
			System.out.println("For pawns, type in \"pawn\" followed by the file letter");
			System.out.println("For bishops, knights and rooks, put \"Q\" or \"K\"");
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
		
		//piece at destination
		Piece other = getPiece(file,rank);
		
			
		return p.move(file, rank, other, color);
	
	}

	/*
	 * checkForCheck will iterate through every move possible for all opposing
	 * pieces. check for check should check if there is a check against BOTH kings.
	 * if the check is against the same color of the piece that just moved, It is an
	 * ILLEGAL MOVE. if the check is against the opposite color of the piece that
	 * just moved it is LEGAL. Note that checkForCheck can return false for a legal
	 * move In addition, the checkForCheckmate() method should be called if there is
	 * a legal check.
	 */
	public static boolean checkForCheck(Color color) {

		
		Piece king = getPiece("king", color);
		 
		if (color == Color.WHITE) {
			for (int i = 0; i < black.size(); i++) {
				Piece p = black.get(i);
				if (p.possibleMove(king.getX(),king.getY())) {
					return true; 
				} 
			} 
		}
		
		else if (color == Color.BLACK) {
			for (int i = 0; i < white.size(); i++) {
				Piece p = white.get(i);
				if (p.possibleMove(king.getX(),king.getY())) {
					return true; 
				} 
			} 
		}

		
		return false;
	}

	// this method will loop through all the possible moves of all the remaining
	// pieces of the team in check
	public static boolean checkForCheckmate() {

		return false;

	}

	
}
