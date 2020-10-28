
import java.util.Scanner;
import java.util.ArrayList;

public class Game extends Board {
	
	
	public Game(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	
	
	public static void main(String[] args) {
		Scanner coordinates = new Scanner(System.in);
		Scanner chessman = new Scanner(System.in);
		
		initPieces();
		
		startGame();
				
		printBoard();
		int turns = 0;
		Piece isValidPiece = null;
		boolean isValidTile = false;
		boolean isTileOpen;
		String piece = null;
				
		while (true/*while checkMate = false*/) {
			
			if (turns % 2 == 0) {
				player = "white";
			}else player = "black"; 
						
			while (isValidPiece == null) {
						
			System.out.println("Which piece would you like to move? ");
			piece = chessman.next();
			isValidPiece = getPiece(piece,player);
			System.out.println(piece);
			}
			while (isValidTile == false) {
								
				System.out.println("Where would you like to move them? ");
				String move = coordinates.next();
				isValidTile = getCoordinates(move,piece);
								
			}
						
		}
		
	}
	
}
