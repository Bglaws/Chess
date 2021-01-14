
public class Bishop extends Piece {

	public Bishop(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	@Override
	public boolean possibleMove(int x, int y) {

		if (this.sameColor(Board.getPiece(x, y)) == true) {
			System.out.println("Cannot capture own piece, invalid move");
			return false;
		}

		if (Math.abs(getX() - x) != Math.abs(getY() - y)) {
			return false;
		}

		if (Board.isPathClear(getX(), getY(), x, y)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		if (this.getColor() == Color.WHITE) {
			return "♗";
		}
		return "♝";
	}

}
