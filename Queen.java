

public class Queen extends Piece {

	public Queen(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	@Override
	public int move(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean possibleMove(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Q";
	}

}

