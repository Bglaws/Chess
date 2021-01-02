import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Game_Test extends Board{

	public static void read() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("game"));
		String[] arr = new String[100];
		Color color = null;
		
		for (int i = 0; sc.hasNext(); i++) {
			
			printBoard();
			
			if (i % 2 == 0) {
				color = Color.WHITE;
			}
			else if (i % 2 != 0) {
				color = Color.BLACK;
			}
			
			arr[i] = sc.nextLine();
			String[] splitStr = arr[i].split(" ");
			String piece = splitStr[0];
			
			if (splitStr[0] == "castle") {
				King king = (King) getPiece("king", color);
				king.castle(splitStr[1], color);
			}
			//piece selected to move
			Piece p = getPiece(piece, color);
			if (p == null) {
				System.out.println("invalid piece, please type in piece to move it.");
				System.exit(0);
			}
			
			String coordinates = splitStr[1];
			if (coordinates.length() != 2) {
				System.out.println("Invalid Tile please try again");
				System.exit(0);;
			}

			int file = coordinates.charAt(0) - 'a'; // y
			int rank = 7 - (coordinates.charAt(1) - '1'); // x

			if (rank < 0 || rank > 7 || file < 0 || file > 7) {
				System.out.println("Invalid Tile please try again");
				System.exit(0);;
			}
			
			//piece at destination
			Piece other = getPiece(file,rank);
			
			p.move(file, rank, other, color);
		
		}
				
	}

	public static void main(String[] args) throws FileNotFoundException {
	
		startGame();
	
		read();
	}
}
