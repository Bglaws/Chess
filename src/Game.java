
import java.util.Scanner;

public class Game {

	// TODO en passant, pawn promotion, castling, stalemate, checkForCheckmate
	public static void main(String[] args) {
		Scanner moveChoice = new Scanner(System.in);

		Board.startGame();

		int turns = 0;

		while (true/* while checkMate = false */) {
			Board.printBoard();
			// check for check
			if (turns % 2 == 0) {
				if (Board.checkForCheck(Color.WHITE) == true) {
					System.out.println("white is in check!");
				}
			} else {
				if (Board.checkForCheck(Color.BLACK) == true) {
					System.out.println("black is in check!");
				}
			}
			// move choice
			System.out.println("Which piece would you like to move? Where would you like to move them?");
			if (turns % 2 == 0) {
				System.out.println("White's turn");
			} else {
				System.out.println("Black's turn");
			}
			String move = moveChoice.nextLine();
			// process move
			if (turns % 2 == 0) {
				if (Board.processMove(move, Color.WHITE) == 0) {
					turns++;
				} else {
					System.out.println("illegal move");
				}
			} else {
				if (Board.processMove(move, Color.BLACK) == 0) {
					turns++;
				} else {
					System.out.println("illegal move");
				}
			}

		}

	}

}
