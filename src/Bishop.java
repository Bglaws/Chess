
public class Bishop extends Piece {

	public Bishop(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	@Override
	public boolean possibleMove(int x, int y) {
		// cannot capture own piece
		if (this.sameColor(Board.getPiece(x, y)) == true) {
			return false;
		}
		// invalid move for bishop
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

	@Override
	public boolean canMove() {

		int originX = this.getX();
		int originY = this.getY();
		Piece other;

		// reset x and y to original position after each while loop
		int x = originX;
		int y = originY;

		// top left
		while ((--x) >= 0 && (--y) >= 0) {
			if (this.possibleMove(x, y)) {
				return true;
			}
		}
		x = originX;
		y = originY;
		// top right
		while ((++x) <= 7 && (--y) >= 0) {
			if (this.possibleMove(x, y)) {
				return true;
			}
		}
		x = originX;
		y = originY;
		// bottom left
		while ((--x) >= 0 && (++y) <= 7) {
			if (this.possibleMove(x, y)) {
				return true;
			}
		}
		x = originX;
		y = originY;
		// bottom right
		while ((++x) <= 7 && (++y) <= 7) {
			if (this.possibleMove(x, y)) {
				return true;
			}
		}

		return false;
	}

}
