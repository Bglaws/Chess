import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game_Test {

	// TODO en passant
	public static void main(String[] args) throws FileNotFoundException {
		Scanner moveChoice = new Scanner(new File("game2.text"));

		while (true) {
			Board.startGame();

			int turns = 0;
			Color color;

			while (true/* while checkMate = false */) {
				Board.printBoard();
				// check for check
				if (turns % 2 == 0) {
					color = Color.WHITE;
				} else
					color = Color.BLACK;

				if (Board.staleMate(color) == true) {
					System.out.println("game over, stalemate");
					break;
				}
				if (Board.checkForCheck(color) == true) {
					if (Board.mate(color) == true) {

						System.out.printf("game over, %s wins \n", color == Color.WHITE ? "White" : "Black");
						break;
					}
					System.out.printf("%s is in check! \n", color == Color.WHITE ? "White" : "Black");
				}

				// move choice
				System.out.printf("%s's turn \n", color == Color.WHITE ? "White" : "Black");

				System.out.println("Which piece would you like to move? Where would you like to move them?");

				String move = moveChoice.nextLine();
				System.out.println(move);
				// process move
				if (Board.processMove(move, color) == 0) {
					turns++;
				} else {
					System.out.println("illegal move");
				}

			}
			System.out.println("would you like to play again? y/n");
			if (moveChoice.next().equals("y")) {
				continue;
			} else
				System.exit(0);
		}
	}

}
