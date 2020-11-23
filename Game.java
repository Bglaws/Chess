
import java.util.Scanner;
import java.util.ArrayList;

public class Game extends Board {
		
	
	public static void main(String[] args) {
		Scanner moveChoice = new Scanner(System.in);
		
		startGame();
				
		printBoard();
		int turns = 0;
		Piece validPiece = null;
		boolean isValidTile = false;
		boolean isTileOpen;
		String piece = null;
				
		while (true/*while checkMate = false*/) {
			System.out.println("Which piece would you like to move? Where would you like to move them?");
			
			String move = moveChoice.nextLine();
						
			if (turns % 2 == 0) {
				if (Board.processMove(move,Color.WHITE) == 0) turns++;
			}
			else {
				if (Board.processMove(move,Color.BLACK) == 0) turns++; 
				
			}
			printBoard();													
		}
		
	}
	
}
