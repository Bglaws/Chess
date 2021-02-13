
public class Rook extends Piece {

	public Rook(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	boolean isFirstMove = true;


	@Override
	public boolean possibleMove(int x, int y) {
		// cannot capture own piece
		if (this.sameColor(Board.getPiece(x, y)) == true) {
			return false;
		}
		// invalid move for rook
		if (Math.abs(getX() - x) != 0 && Math.abs(getY() - y) != 0) {
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
			return "♖";
		}
		return "♜";
	}

	@Override
	public boolean canMove() {
		int x = this.getX();
		int y = this.getY();

		// left
		while ((--x) >= 0 && y >= 0) {
			if (this.testMove(x, y)) {
				return true;
			}
		}
		x = this.getX();
		y = this.getY();
		// right
		while ((++x) <= 7 && y >= 0) {
			if (this.testMove(x, y)) {
				return true;
			}
		}
		x = this.getX();
		y = this.getY();
		// down
		while (x >= 0 && (++y) <= 7) {
			if (this.testMove(x, y)) {
				return true;
			}
		}
		x = this.getX();
		y = this.getY();
		// up
		while (x <= 7 && (--y) >= 0) {
			if (this.testMove(x, y)) {
				return true;
			}
		}

		return false;
	}

}
