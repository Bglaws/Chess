import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game_Test {

	// TODO en passant, pawn promotion, castling, stalemate, checkForCheckmate
	public static void main(String[] args) throws FileNotFoundException {
		Scanner moveChoice = new Scanner(new File("game.text"));
		Board.startGame();

		int turns = 0;

		while (true/* while checkMate = false */) {
			Board.printBoard();

			if (turns % 2 == 0) {
				if (Board.checkForCheck(Color.WHITE) == true) {
					System.out.println("white is in check!");
				}
			} else {
				if (Board.checkForCheck(Color.BLACK) == true) {
					System.out.println("black is in check!");
				}
			}

			System.out.println("Which piece would you like to move? Where would you like to move them?");
			if (turns % 2 == 0) {
				System.out.println("White's turn");
			} else {
				System.out.println("Black's turn");
			}
			String move = moveChoice.nextLine();
			System.out.println(move);

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
