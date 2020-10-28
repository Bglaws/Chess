
import java.util.ArrayList;

public class Board extends Piece {

	public Board(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
		// TODO Auto-generated constructor stub
	}
	
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
		int count = 8 , count2 = count;
		for (int i = 0; i < 8; i++) {
			System.out.print(count2 + " ");
			count2--;
			System.out.print("| ");
			for (int j = 0; j < 8; j++) {
				
				System.out.print(board [i] [j] + " | ");
			}
			System.out.print(count);
			count--;
			System.out.println();
			System.out.println("  ---------------------------------");
		}
		System.out.println("    a   b   c   d   e   f   g   h");			
	}
	
	
	static void initPieces() {
		
	}
	 
	static void startGame() {
														   
		//black
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
		 												//ArrayList index
		black.add(rook1); board[0][0] = rook1;						  //0
		black.add(knight1); board[0][1] = knight1;					  //1
		black.add(bishop1);	board[0][2] = bishop1;					  //2 
		black.add(queen1); board[0][3] = queen1;					  //3
		black.add(king1); board[0][4] = king1;						  //4
		black.add(bishop2);	board[0][5] = bishop2;					  //5 
		black.add(knight2);	board[0][6] = knight2;					  //6 
		black.add(rook2); board[0][7] = rook2;						  //7
		
		black.add(pawn1); board[1][0] = pawn1;						  //8
		black.add(pawn2); board[1][1] = pawn2;						  //9	
		black.add(pawn3); board[1][2] = pawn3;					      //10 
		black.add(pawn4); board[1][3] = pawn4;						  //11
		black.add(pawn5); board[1][4] = pawn5;                        //12
		black.add(pawn6); board[1][5] = pawn6;						  //13
		black.add(pawn7); board[1][6] = pawn7;						  //14
		black.add(pawn8); board[1][7] = pawn8;						  //15 
		
		//white
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
														//ArrayList index
		white.add(rook3); board[7][0] = rook3;  					  //0
		white.add(knight3); board[7][1] = knight3;					  //1 
		white.add(bishop3); board[7][2] = bishop3;					  //2
		white.add(queen2); board[7][3] = queen2;  					  //3
		white.add(king2); board[7][4] = king2;						  //4
		white.add(bishop4); board[7][5] = bishop4; 					  //5 
		white.add(knight4); board[7][6] = knight4;					  //6 
		white.add(rook4); board[7][7] = rook4;					      //7
		
		white.add(pawn9); board[6][0] = pawn9;					      //8
		white.add(pawn10); board[6][1] = pawn10;					  //9
		white.add(pawn11); board[6][2] = pawn11;				      //10
		white.add(pawn12); board[6][3] = pawn12;				      //11
		white.add(pawn13); board[6][4] = pawn13;				      //12
		white.add(pawn14); board[6][5] = pawn14;				      //13
		white.add(pawn15); board[6][6] = pawn15; 					  //14
		white.add(pawn16); board[6][7] = pawn16;				      //15
	}
	
	
	public static Piece getPiece(String piece, String player) {
		
		//Major and Minor pieces
		if (piece.equals("rookQ")) { 
			if (player.equals("white")) return white.get(0);
			else if (player.equals("black")) return black.get(0);
		}  
		if (piece.equals("knightQ")) { 
			if (player.equals("white")) return white.get(1);
			else if (player.equals("black")) return black.get(1);
		}  
		if (piece.equals("bishopQ")) { 
			if (player.equals("white")) return white.get(2);
			else if (player.equals("black")) return black.get(2);
		}  
		if (piece.equals("queen")) { 
			if (player.equals("white")) return white.get(3);
			else if (player.equals("black")) return black.get(3);
		}  
		if (piece.equals("king")) { 
			if (player.equals("white")) return white.get(4);
			else if (player.equals("black")) return black.get(4);
		}  
		if (piece.equals("bishopK")) { 
			if (player.equals("white")) return white.get(5);
			else if (player.equals("black")) return black.get(5);
		}  
		if (piece.equals("knightK")) { 
			if (player.equals("white")) return white.get(6);
			else if (player.equals("black")) return black.get(6);
		}  
		if (piece.equals("rookK")) { 
			if (player.equals("white")) return white.get(7);
			else if (player.equals("black")) return black.get(7);
		}  
		
		//pawns
		if (piece.equals("pawnA")) { 
			if (player.equals("white")) return white.get(8);
			else if (player.equals("black")) return black.get(8);
		}  
		if (piece.equals("pawnB")) { 
			if (player.equals("white")) return white.get(9);
			else if (player.equals("black")) return black.get(9);
		} 
		if (piece.equals("pawnC")) { 
			if (player.equals("white")) return white.get(10);
			else if (player.equals("black")) return black.get(10);
		} 
		if (piece.equals("pawnD")) { 
			if (player.equals("white")) return white.get(11);
			else if (player.equals("black")) return black.get(11);
		} 
		if (piece.equals("pawnE")) { 
			if (player.equals("white")) return white.get(12);
			else if (player.equals("black")) return black.get(12);
		} 
		if (piece.equals("pawnF")) { 
			if (player.equals("white")) return white.get(13);
			else if (player.equals("black")) return black.get(13);
		} 
		if (piece.equals("pawnG")) { 
			if (player.equals("white")) return white.get(14);
			else if (player.equals("black")) return black.get(14);
		} 
		if (piece.equals("pawnH")) { 
			if (player.equals("white")) return white.get(15);
			else if (player.equals("black")) return black.get(15);
		} 
		
		System.out.println("invalid piece, please type in full name of piece to move it.");
		System.out.println("For pawns, type in \"pawn\" or \"Pawn\" followed by the file letter");
		System.out.println("For bishops, knights and rooks, put \"Q\" or \"K\" to specify whichside");
		System.out.println("Example: PawnA, bishopQ");
		return null;
		
	}
	
	static boolean getCoordinates(String move, String piece) {

		if (move == "a1") { isValidMove(piece, move); }
		else if (move == "a3") { isValidMove(piece, move); }
		else if (move == "a4") { isValidMove(piece, move); }
		else if (move == "a2") { isValidMove(piece, move); }
		else if (move == "a5") { isValidMove(piece, move); }
		else if (move == "a6") { isValidMove(piece, move); }
		else if (move == "a7") { isValidMove(piece, move); }
		else if (move == "a8") { isValidMove(piece, move); }

		else if (move == "b1") { isValidMove(piece, move); }
		else if (move == "b2") { isValidMove(piece, move); }
		else if (move == "b3") { isValidMove(piece, move); }
		else if (move == "b4") { isValidMove(piece, move); }
		else if (move == "b5") { isValidMove(piece, move); }
		else if (move == "b6") { isValidMove(piece, move); }
		else if (move == "b7") { isValidMove(piece, move); }
		else if (move == "b8") { isValidMove(piece, move); }

		else if (move == "c1") { isValidMove(piece, move); }
		else if (move == "c2") { isValidMove(piece, move); }
		else if (move == "c3") { isValidMove(piece, move); }
		else if (move == "c4") { isValidMove(piece, move); }
		else if (move == "c5") { isValidMove(piece, move); }
		else if (move == "c6") { isValidMove(piece, move); }
		else if (move == "c7") { isValidMove(piece, move); }
		else if (move == "c8") { isValidMove(piece, move); }

		else if (move == "d1") { isValidMove(piece, move); }
		else if (move == "d2") { isValidMove(piece, move); }
		else if (move == "d3") { isValidMove(piece, move); }
		else if (move == "d4") { isValidMove(piece, move); }
		else if (move == "d5") { isValidMove(piece, move); }
		else if (move == "d6") { isValidMove(piece, move); }
		else if (move == "d7") { isValidMove(piece, move); }
		else if (move == "d8") { isValidMove(piece, move); }

		else if (move == "e1") { isValidMove(piece, move); }
		else if (move == "e2") { isValidMove(piece, move); }
		else if (move == "e3") { isValidMove(piece, move); }
		else if (move == "e4") { isValidMove(piece, move); }
		else if (move == "e5") { isValidMove(piece, move); }
		else if (move == "e6") { isValidMove(piece, move); }
		else if (move == "e7") { isValidMove(piece, move); }
		else if (move == "e8") { isValidMove(piece, move); }

		else if (move == "f1") { isValidMove(piece, move); }
		else if (move == "f2") { isValidMove(piece, move); }
		else if (move == "f3") { isValidMove(piece, move); }
		else if (move == "f4") { isValidMove(piece, move); }
		else if (move == "f5") { isValidMove(piece, move); }
		else if (move == "f6") { isValidMove(piece, move); }
		else if (move == "f7") { isValidMove(piece, move); }
		else if (move == "f8") { isValidMove(piece, move); }

		else if (move == "g1") { isValidMove(piece, move); }
		else if (move == "g2") { isValidMove(piece, move); }
		else if (move == "g3") { isValidMove(piece, move); }
		else if (move == "g4") { isValidMove(piece, move); }
		else if (move == "g5") { isValidMove(piece, move); }
		else if (move == "g6") { isValidMove(piece, move); }
		else if (move == "g7") { isValidMove(piece, move); }
		else if (move == "g8") { isValidMove(piece, move); }

		else if (move == "h1") { isValidMove(piece, move); }
		else if (move == "h2") { isValidMove(piece, move); }
		else if (move == "h3") { isValidMove(piece, move); }
		else if (move == "h4") { isValidMove(piece, move); }
		else if (move == "h5") { isValidMove(piece, move); }
		else if (move == "h6") { isValidMove(piece, move); }
		else if (move == "h7") { isValidMove(piece, move); }
		else if (move == "h8") { isValidMove(piece, move); }
		

		System.out.println("Invalid Tile please try again");
		return false;
	}
	
	static boolean isValidMove(String piece, String move) {
		
		// get current position of selected piece 
		
		
		//
		//check to see if move is valid for selected piece, then if it is call isTileOpen. 
		// else print "invalid move for " + piece
		return false;
	}
	
	static boolean isTileOpen(String move) {
		
		/*if tile is open move piece to specified coordinates, else call getColor to
		 * find what piece is there, 
		 */
		if (move != " ") {
			
		}
		
		return false;
	}

	@Override
	public void move(int x, int y) {
		
	}
	
}
