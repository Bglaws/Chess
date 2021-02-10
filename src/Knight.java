
public class Knight extends Piece {

	public Knight(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	@Override
	public boolean possibleMove(int x, int y) {
		// cannot capture own piece
		if (this.sameColor(Board.getPiece(x, y)) == true) {
			return false;
		}

		if (Math.abs(this.getY() - y) == 2 && Math.abs(this.getX() - x) == 1
				|| Math.abs(this.getY() - y) == 1 && Math.abs(this.getX() - x) == 2) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		if (this.getColor() == Color.WHITE) {
			return "♘";
		}
		return "♞";
	}

	@Override
	public boolean canMove() {

		int x = this.getX();
		int y = this.getY();

		// left & up
		if (this.testMove(x - 2, y - 1)) {
			return true;
		}
		if (this.testMove(x - 1, y - 2)) {
			return true;
		}

		// right & up
		if (this.testMove(x + 2, y - 1)) {
			return true;
		}
		if (this.testMove(x + 1, y - 2)) {
			return true;
		}

		// left & down
		if (this.testMove(x - 2, y + 1)) {
			return true;
		}
		if (this.testMove(x - 1, y + 2)) {
			return true;
		}

		// right & down
		if (this.testMove(x + 2, y + 1)) {
			return true;
		}
		if (this.testMove(x + 1, y + 2)) {
			return true;
		}

		return false;
	}

}
