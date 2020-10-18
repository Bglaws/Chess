import java.util.Scanner;

public class Game extends Board {
	
	private Pieces piece;
	
	Pieces pieces = new Pieces();
	
	static void startGame() {
		
		//black
		board[0][0] = "R"; board[1][0] = "P";
		board[0][1] = "K"; board[1][1] = "P";
		board[0][2] = "B"; board[1][2] = "P";
		board[0][3] = "Q"; board[1][3] = "P";
		board[0][4] = "K"; board[1][4] = "P"; 
		board[0][5] = "B"; board[1][5] = "P";
		board[0][6] = "K"; board[1][6] = "P";
		board[0][7] = "R"; board[1][7] = "P";
		
		//white
		board[7][0] = "R"; board[6][0] = "P";  // board[6][0] = 
		board[7][1] = "K"; board[6][1] = "P";
		board[7][2] = "B"; board[6][2] = "P";
		board[7][3] = "Q"; board[6][3] = "P";
		board[7][4] = "K"; board[6][4] = "P"; 
		board[7][5] = "B"; board[6][5] = "P";
		board[7][6] = "K"; board[6][6] = "P";
		board[7][7] = "R"; board[6][7] = "P";
	}
	
	public static void main(String[] args) {
		Scanner coordinates = new Scanner(System.in);
		Scanner chessman = new Scanner(System.in);
		
		startGame();
				
		printBoard();
		int turns = 0;
		boolean isValidPiece = false;
		boolean isValidTile = false;
		boolean isTileOpen;
				
		while(true/*while checkMate = false*/) {
			
			if (turns % 2 == 0) {
				player = "white";
			}else player = "black"; 
						
			while (isValidPiece == false) {
						
			System.out.println("Which piece would you like to move? ");
			String piece = chessman.next();
			isValidPiece = getPiece(piece);
			System.out.println(piece);
			}
			while (isValidTile == false) {
								
				System.out.println("Where would you like to move them? ");
				String move = coordinates.next();
				isValidTile = getCoordinates(move);				
			}
			while (isTileOpen = false) {
				
			}
						
			
		}
		
	}
	
}

