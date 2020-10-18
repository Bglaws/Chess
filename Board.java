

public class Board extends Pieces {

	static String[][] board = {{" ", " ", " ", " ", " ", " ", " ", " "},  // 
							{" ", " ", " ", " ", " ", " ", " ", " "},	// 
							{" ", " ", " ", " ", " ", " ", " ", " "},	// 
							{" ", " ", " ", " ", " ", " ", " ", " "},	// 
							{" ", " ", " ", " ", " ", " ", " ", " "},	// 
							{" ", " ", " ", " ", " ", " ", " ", " "},	// 
							{" ", " ", " ", " ", " ", " ", " ", " "},	// 
							{" ", " ", " ", " ", " ", " ", " ", " "}};  // 
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
		if (move == "a2") move = board[6][0];
		if (move == "a3") move = board[5][0];
		if (move == "a4") move = board[4][0];
		if (move == "a5") move = board[3][0];
		if (move == "a6") move = board[2][0];
		if (move == "a7") move = board[1][0];
		if (move == "a8") move = board[0][0];
		
		if (move == "b1") move = board[7][1];
		if (move == "b2") move = board[6][1];
		if (move == "b3") move = board[5][1];
		if (move == "b4") move = board[4][1];
		if (move == "b5") move = board[3][1];
		if (move == "b6") move = board[2][1];
		if (move == "b7") move = board[1][1];
		if (move == "b8") move = board[0][1];
		
		if (move == "c1") move = board[7][2];
		if (move == "c2") move = board[6][2];
		if (move == "c3") move = board[5][2];
		if (move == "c4") move = board[4][2];
		if (move == "c5") move = board[3][2];
		if (move == "c6") move = board[2][2];
		if (move == "c7") move = board[1][2];
		if (move == "c8") move = board[0][2];
		
		if (move == "d1") move = board[7][3];
		if (move == "d2") move = board[6][3];
		if (move == "d3") move = board[5][3];
		if (move == "d4") move = board[4][3];
		if (move == "d5") move = board[3][3];
		if (move == "d6") move = board[2][3];
		if (move == "d7") move = board[1][3];
		if (move == "d8") move = board[0][3];
		
		if (move == "e1") move = board[7][4];
		if (move == "e2") move = board[6][4];
		if (move == "e3") move = board[5][4];
		if (move == "e4") move = board[4][4];
		if (move == "e5") move = board[3][4];
		if (move == "e6") move = board[2][4];
		if (move == "e7") move = board[1][4];
		if (move == "e8") move = board[0][4];
		
		if (move == "f1") move = board[7][5];
		if (move == "f2") move = board[6][5];
		if (move == "f3") move = board[5][5];
		if (move == "f4") move = board[4][5];
		if (move == "f5") move = board[3][5];
		if (move == "f6") move = board[2][5];
		if (move == "f7") move = board[1][5];
		if (move == "f8") move = board[0][5];
		
		if (move == "g1") move = board[7][6];
		if (move == "g2") move = board[6][6];
		if (move == "g3") move = board[5][6];
		if (move == "g4") move = board[4][6];
		if (move == "g5") move = board[3][6];
		if (move == "g6") move = board[2][6];
		if (move == "g7") move = board[1][6];
		if (move == "g8") move = board[0][6];
		
		if (move == "h1") move = board[7][7];
		if (move == "h2") move = board[6][7];
		if (move == "h3") move = board[5][7];
		if (move == "h4") move = board[4][7];
		if (move == "h5") move = board[3][7];
		if (move == "h6") move = board[2][7];
		if (move == "h7") move = board[1][7];
		if (move == "h8") move = board[0][7];			
			
			
//		//	|| move == "b2" || move == "b3" || move == "b4") return true;
//		if (move == "b5" || move == "b6" || move == "b7" || move == "b8") return true;
//		if (move == "c1" || move == "c2" || move == "c3" || move == "c4") return true;
//		if (move == "c5" || move == "c6" || move == "c7" || move == "c8") return true;
//		if (move == "d1" || move == "d2" || move == "d3" || move == "d4") return true;
//		if (move == "d5" || move == "d6" || move == "d7" || move == "d8") return true;
//		if (move == "e1" || move == "e2" || move == "e3" || move == "e4") return true;
//		if (move == "e5" || move == "e6" || move == "e7" || move == "e8") return true;
//		if (move == "f1" || move == "f2" || move == "f3" || move == "f4") return true;
//		if (move == "f5" || move == "f6" || move == "f7" || move == "f8") return true;
//		if (move == "g1" || move == "g2" || move == "g3" || move == "g4") return true;
//		if (move == "g5" || move == "g6" || move == "g7" || move == "g8") return true;
//		if (move == "h1" || move == "h2" || move == "h3" || move == "h4") return true;
//		if (move == "h5" || move == "h6" || move == "h7" || move == "h8") return true;
		
		System.out.println("Invalid Tile please try again");
		return false; 
	}
	
	static boolean isTileOpen(String move) {
		if (move != " ") {
			
		}
		
		return false;
	}
	
}
