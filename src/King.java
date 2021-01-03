
public class King extends Piece {

	public King(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	boolean isFirstMove = true;

	@Override
	public boolean possibleMove(int x, int y) {
		if (this.getColor() == Color.WHITE) {

			if (this.sameColor(Board.getPiece(x, y)) == true) {
				System.out.println("Cannot capture own piece, invalid move");
				return false;
			}

			else if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 1) { // bishop
				isFirstMove = false;
				return true;
			}

			else if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 0
					|| Math.abs(getX() - x) == 0 && Math.abs(getY() - y) == 1) { // rook
				isFirstMove = false;
				return true;
			}
		}

		if (this.getColor() == Color.BLACK) {

			if (this.sameColor(Board.getPiece(x, y)) == true) {
				System.out.println("Cannot capture own piece, invalid move");
				return false;
			} else if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 1) { // bishop
				isFirstMove = false;
				return true;
			}

			else if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 0
					|| Math.abs(getX() - x) == 0 && Math.abs(getY() - y) == 1) { // rook
				isFirstMove = false;
				return true;
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "K";
	}

	public int castle(String side) {
		Rook rook = (Rook) Board.getPiece("rook" + side, this.getColor());

		if (this.isFirstMove != true || rook.isFirstMove != true
				|| Board.isPathClear(this.getX(), this.getY(), rook.getX(), rook.getY()) != true) {
			System.out.println("Cannot castle if king or rook has already moved");
			return -1;
		}

		if (this.getColor() == Color.WHITE) {
			if (side.equals("K")) {
				// cant castle accross a line of check
				if (this.move(5, 0, null, this.getColor()) == 0 && this.move(6, 0, null, this.getColor()) == 0) {
					rook.move(5, 0, null, this.getColor());
					System.out.println("this if statement doesnt work/ possibleMove(), called by move return false");
					return 0;
				}
				return -1;
			}

			else if (side.equals("Q")) {
				// cant castle accross a line of check
				if (this.move(3, 0, null, this.getColor()) == 0 && this.move(2, 0, null, this.getColor()) == 0) {
					rook.move(3, 0, null, this.getColor());
					return 0;
				}
				return -1;
			}
		}
		if (this.getColor() == Color.BLACK) {

			if (side.equals("K")) {
				// cant castle accross a line of check
				if (this.move(5, 7, null, this.getColor()) == 0 && this.move(6, 7, null, this.getColor()) == 0) {
					rook.move(5, 7, null, this.getColor());
					return 0;
				}
				return -1;
			}

			else if (side.equals("Q")) {
				// cant castle accross a line of check
				if (this.move(3, 7, null, this.getColor()) == 0 && this.move(2, 7, null, this.getColor()) == 0) {
					rook.move(3, 7, null, this.getColor());
					return 0;
				}
				return -1;
			}
		}
		System.out.println("something went wrong in castle()");
		return -1;

	}

}
