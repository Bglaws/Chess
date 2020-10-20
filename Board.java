

public class Board extends Piece {

	static Piece Board[][] = new Piece[8][8];
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
	
	static boolean getCoordinates(String move) {
		
		
		if (move == "a1") {move = board[7][0]; isTileOpen(move);}
		if (move == "a2") {move = board[6][0]; isTileOpen(move);}
		if (move == "a3") {move = board[5][0]; isTileOpen(move);}
		if (move == "a4") {move = board[4][0]; isTileOpen(move);}
		if (move == "a5") {move = board[3][0]; isTileOpen(move);}
		if (move == "a6") {move = board[2][0]; isTileOpen(move);}
		if (move == "a7") {move = board[1][0]; isTileOpen(move);}
		if (move == "a8") {move = board[0][0]; isTileOpen(move);}
		
		if (move == "b1") {move = board[7][1]; isTileOpen(move);}
		if (move == "b2") {move = board[6][1]; isTileOpen(move);}
		if (move == "b3") {move = board[5][1]; isTileOpen(move);}
		if (move == "b4") {move = board[4][1]; isTileOpen(move);}
		if (move == "b5") {move = board[3][1]; isTileOpen(move);}
		if (move == "b6") {move = board[2][1]; isTileOpen(move);}
		if (move == "b7") {move = board[1][1]; isTileOpen(move);}
		if (move == "b8") {move = board[0][1]; isTileOpen(move);}
		
		if (move == "c1") {move = board[7][2]; isTileOpen(move);}
		if (move == "c2") {move = board[6][2]; isTileOpen(move);}
		if (move == "c3") {move = board[5][2]; isTileOpen(move);}
		if (move == "c4") {move = board[4][2]; isTileOpen(move);}
		if (move == "c5") {move = board[3][2]; isTileOpen(move);}
		if (move == "c6") {move = board[2][2]; isTileOpen(move);}
		if (move == "c7") {move = board[1][2]; isTileOpen(move);}
		if (move == "c8") {move = board[0][2]; isTileOpen(move);}
		
		if (move == "d1") {move = board[7][3]; isTileOpen(move);}
		if (move == "d2") {move = board[6][3]; isTileOpen(move);}
		if (move == "d3") {move = board[5][3]; isTileOpen(move);}
		if (move == "d4") {move = board[4][3]; isTileOpen(move);}
		if (move == "d5") {move = board[3][3]; isTileOpen(move);}
		if (move == "d6") {move = board[2][3]; isTileOpen(move);}
		if (move == "d7") {move = board[1][3]; isTileOpen(move);}
		if (move == "d8") {move = board[0][3]; isTileOpen(move);}
		
		if (move == "e1") {move = board[7][4]; isTileOpen(move);}
		if (move == "e2") {move = board[6][4]; isTileOpen(move);}
		if (move == "e3") {move = board[5][4]; isTileOpen(move);}
		if (move == "e4") {move = board[4][4]; isTileOpen(move);}
		if (move == "e5") {move = board[3][4]; isTileOpen(move);}
		if (move == "e6") {move = board[2][4]; isTileOpen(move);}
		if (move == "e7") {move = board[1][4]; isTileOpen(move);}
		if (move == "e8") {move = board[0][4]; isTileOpen(move);}
		
		if (move == "f1") {move = board[7][5]; isTileOpen(move);}
		if (move == "f2") {move = board[6][5]; isTileOpen(move);}
		if (move == "f3") {move = board[5][5]; isTileOpen(move);}
		if (move == "f4") {move = board[4][5]; isTileOpen(move);}
		if (move == "f5") {move = board[3][5]; isTileOpen(move);}
		if (move == "f6") {move = board[2][5]; isTileOpen(move);}
		if (move == "f7") {move = board[1][5]; isTileOpen(move);}
		if (move == "f8") {move = board[0][5]; isTileOpen(move);}
		
		if (move == "g1") {move = board[7][6]; isTileOpen(move);}
		if (move == "g2") {move = board[6][6]; isTileOpen(move);}
		if (move == "g3") {move = board[5][6]; isTileOpen(move);}
		if (move == "g4") {move = board[4][6]; isTileOpen(move);}
		if (move == "g5") {move = board[3][6]; isTileOpen(move);}
		if (move == "g6") {move = board[2][6]; isTileOpen(move);}
		if (move == "g7") {move = board[1][6]; isTileOpen(move);}
		if (move == "g8") {move = board[0][6]; isTileOpen(move);}
		
		if (move == "h1") {move = board[7][7]; isTileOpen(move);}
		if (move == "h2") {move = board[6][7]; isTileOpen(move);}
		if (move == "h3") {move = board[5][7]; isTileOpen(move);}
		if (move == "h4") {move = board[4][7]; isTileOpen(move);}
		if (move == "h5") {move = board[3][7]; isTileOpen(move);}
		if (move == "h6") {move = board[2][7]; isTileOpen(move);}
		if (move == "h7") {move = board[1][7]; isTileOpen(move);}
		if (move == "h8") {move = board[0][7]; isTileOpen(move);}
			
					
		System.out.println("Invalid Tile please try again");
		return false; 
	}
	
	static boolean isTileOpen(String move) {
		if (move != " ") {
			
		}
		
		return false;
	}
	
}

