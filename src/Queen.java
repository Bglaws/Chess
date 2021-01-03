
public class Queen extends Piece {

	public Queen(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	@Override
	public boolean possibleMove(int x, int y) {

		if (this.sameColor(Board.getPiece(x, y)) == true) {
			System.out.println("Cannot capture own piece, invalid move");
			return false;
		}

		if (Board.isPathClear(getX(), getY(), x, y) && Math.abs(getX() - x) == Math.abs(getY() - y)) { // bishop
			return true;
		}

		if (Board.isPathClear(getX(), getY(), x, y) && Math.abs(getX() - x) != 0 && Math.abs(getY() - y) == 0
				|| Math.abs(getX() - x) == 0 && Math.abs(getY() - y) != 0) {// rook
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Q";
	}

}
