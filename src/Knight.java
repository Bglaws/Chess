
public class Knight extends Piece {

	public Knight(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	@Override
	public boolean possibleMove(int x, int y) {

		if (this.sameColor(Board.getPiece(x, y)) == true) {
			System.out.println("Cannot capture own piece, invalid move");
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

		// left & up
		int x = this.getX() - 2;
		int y = this.getY() - 1;
		if (x >= 0 && y >= 0 && possibleMove(x, y) == true) {
			return true;
		}

		x = this.getX() - 1;
		y = this.getY() - 2;
		if (x >= 0 && y >= 0 && possibleMove(x, y) == true) {
			return true;
		}

		// right & up
		x = this.getX() + 2;
		y = this.getY() - 1;
		if (x <= 7 && y >= 0 && possibleMove(x, y) == true) {
			return true;
		}

		x = this.getX() + 1;
		y = this.getY() - 2;
		if (x <= 7 && y >= 0 && possibleMove(x, y) == true) {
			return true;
		}

		// left & down
		x = this.getX() - 2;
		y = this.getY() + 1;
		if (x >= 0 && y <= 7 && possibleMove(x, y) == true) {
			return true;
		}

		x = this.getX() - 1;
		y = this.getY() + 2;
		if (x >= 0 && y <= 7 && possibleMove(x, y) == true) {
			return true;
		}

		// right & down
		x = this.getX() + 2;
		y = this.getY() + 1;
		if (x <= 7 && y <= 7 && possibleMove(x, y) == true) {
			return true;
		}

		x = this.getX() + 1;
		y = this.getY() + 2;
		if (x <= 7 && y <= 7 && possibleMove(x, y) == true) {
			return true;
		}

		return false;
	}

}
