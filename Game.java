
import java.util.Scanner;
import java.util.ArrayList;

public class Game extends Board {
		
	
	public static void main(String[] args) {
		Scanner moveChoice = new Scanner(System.in);
		
		startGame();
				
		
		int turns = 0;
		
		
		while (true/*while checkMate = false*/) {
			if (turns % 2 == 0) {
				if (checkForCheck(Color.WHITE) == true) {
					System.out.println("white is in check!");
				}
			}
			else {
				if (checkForCheck(Color.BLACK) == true) {
					System.out.println("black is in check!"); 
				}			
			}
			printBoard();
			
			System.out.println("Which piece would you like to move? Where would you like to move them?");
			
			String move = moveChoice.nextLine();
						
			if (turns % 2 == 0) {
				if (Board.processMove(move,Color.WHITE) == 0) {
					turns++;
				}
				else {
					System.out.println("illegal move");
				}
			}
			else {
				if (Board.processMove(move,Color.BLACK) == 0) {
					turns++; 
				}
				else {
					System.out.println("illegal move");
				}
			}
			
			
		}
		
	}
	
}
