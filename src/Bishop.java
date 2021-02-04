
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
		int x = this.getX();
		int y = this.getY();

		// top left
		while ((--x) >= 0 && (--y) >= 0) {
			if (this.possibleMove(x, y)) {
				return true;
			}
		}
		x = this.getX();
		y = this.getY();
		// top right
		while ((++x) <= 7 && (--y) >= 0) {
			if (this.possibleMove(x, y)) {
				return true;
			}
		}
		x = this.getX();
		y = this.getY();
		// bottom left
		while ((--x) >= 0 && (++y) <= 7) {
			if (this.possibleMove(x, y)) {
				return true;
			}
		}
		x = this.getX();
		y = this.getY();
		// bottom right
		while ((++x) <= 7 && (++y) <= 7) {
			if (this.possibleMove(x, y)) {
				return true;
			}
		}

		return false;
	}

}
