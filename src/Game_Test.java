
public class Game_Test extends Board{


	public static void main(String[] args) {
	
		startGame();
	
		/* grab white pawnA */
		Pawn pawnA = (Pawn) Board.getPiece("pawnA", Color.WHITE);
	
		if (pawnA.possibleMove(0, 3) != true)
		{
			System.out.println("Test 1: expected pawnA.possibleMove(0, 3) to return true.");
		}
	}
}
