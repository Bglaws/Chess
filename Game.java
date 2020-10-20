
import java.util.Scanner;

public class Game extends Board {
	
	
	static void initializePieces() {
		Pawn p1 = new Pawn(); 
		
	}
	
	static void startGame() {
		
		//black
		board[0][0] = new Rook(); board[1][0] = new Pawn();
		board[0][1] = new Knight(); board[1][1] = new Pawn();
		board[0][2] = new Bishop(); board[1][2] = new Pawn();
		board[0][3] = new Queen(); board[1][3] = new Pawn();
		board[0][4] = new King(); board[1][4] = new Pawn(); 
		board[0][5] = new Bishop(); board[1][5] = new Pawn();
		board[0][6] = new Knight(); board[1][6] = new Pawn();
		board[0][7] = new Rook(); board[1][7] = new Pawn();
		
		//white
		board[7][0] = new Rook(); board[6][0] = new Pawn();  
		board[7][1] = new Knight(); board[6][1] = new Pawn();
		board[7][2] = new Bishop(); board[6][2] = new Pawn();
		board[7][3] = new Queen(); board[6][3] = new Pawn();
		board[7][4] = new King(); board[6][4] = new Pawn();
		board[7][5] = new Bishop(); board[6][5] = new Pawn();
		board[7][6] = new Knight(); board[6][6] = new Pawn();
		board[7][7] = new Rook(); board[6][7] = new Pawn();
	}
	
	public static void main(String[] args) {
		Scanner coordinates = new Scanner(System.in);
		Scanner chessman = new Scanner(System.in);
		
		initializePieces();		
		
		//Game game = new Game(pawn, bishop, knight, rook, queen, king);
		
		startGame();
				
		printBoard();
		int turns = 0;
		boolean isValidPiece = false;
		boolean isValidTile = false;
		boolean isTileOpen;
				
		while (true/*while checkMate = false*/) {
			
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
						
		}
		
	}
	
}

