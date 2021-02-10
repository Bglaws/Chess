
public class King extends Piece {

	public King(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	boolean isFirstMove = true;

	@Override
	public boolean possibleMove(int x, int y) {
		// cannot capture own piece
		if (this.sameColor(Board.getPiece(x, y)) == true) {
			return false;
		}
		// bishop
		else if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 1) {
			return true;
		}
		// rook
		else if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 0
				|| Math.abs(getX() - x) == 0 && Math.abs(getY() - y) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		if (this.getColor() == Color.WHITE) {
			return "♔";
		}
		return "♚";
	}

	public int castle(String side) {
		Rook rook = (Rook) Board.getPiece("rook" + side, this.getColor());
		int originX = this.getX();
		int originY = this.getY();

		if (this.isFirstMove != true || rook.isFirstMove != true) {
			System.out.println("Cannot castle if king or rook has already moved");
			return -1;
		}
		if (Board.isPathClear(this.getX(), this.getY(), rook.getX(), rook.getY()) != true) {
			System.out.println("Cannot castle across a line of check");
			return -1;
		}

		if (this.getColor() == Color.WHITE) {

			if (side.equals("K")) {
				// cant castle accross a line of check
				if (this.move(5, 7, null) == 0 && this.move(6, 7, null) == 0) {
					Board.setPiece(rook.getX(), rook.getY(), null);
					Board.setPiece(5, 7, rook);
					return 0;
				} else {
					Board.setPiece(this.getX(), this.getY(), null);
					Board.setPiece(originX, originY, this);
					return -1;
				}
			}

			else if (side.equals("Q")) {
				// cant castle accross a line of check
				if (this.move(3, 7, null) == 0 && this.move(2, 7, null) == 0) {
					Board.setPiece(rook.getX(), rook.getY(), null);
					Board.setPiece(3, 7, rook);
					return 0;
				} else {
					Board.setPiece(this.getX(), this.getY(), null);
					Board.setPiece(originX, originY, this);
					return -1;
				}
			}
		}

		if (this.getColor() == Color.BLACK) {
			if (side.equals("K")) {
				// cant castle accross a line of check
				if (this.move(5, 0, null) == 0 && this.move(6, 0, null) == 0) {
					Board.setPiece(rook.getX(), rook.getY(), null);
					Board.setPiece(5, 0, rook);
					return 0;
				} else {
					Board.setPiece(this.getX(), this.getY(), null);
					Board.setPiece(originX, originY, this);
					return -1;
				}
			}

			else if (side.equals("Q")) {
				// cant castle accross a line of check
				if (this.move(3, 0, null) == 0 && this.move(2, 0, null) == 0) {
					Board.setPiece(rook.getX(), rook.getY(), null);
					Board.setPiece(3, 0, rook);
					return 0;
				} else {
					Board.setPiece(this.getX(), this.getY(), null);
					Board.setPiece(originX, originY, this);
					return -1;
				}
			}
		}
		return -1;
	}

	@Override
	public boolean canMove() {
		int x = this.getX();
		int y = this.getY();

		// bishop
		// top left
		if (x > 0 && y > 0 && possibleMove(x - 1, y - 1) == true) {
			return true;
		}
		// top right
		if (x < 7 && y > 0 && possibleMove(x + 1, y - 1) == true) {
			return true;
		}
		// bottom left
		if (x > 0 && y < 7 && possibleMove(x - 1, y + 1) == true) {
			return true;
		}
		// bottom right
		if (x < 7 && y < 7 && possibleMove(x + 1, y + 1) == true) {
			return true;
		}

		// rook
		// left
		if (x > 0 && possibleMove(x - 1, y) == true) {
			return true;
		}
		// right
		if (x < 7 && possibleMove(x + 1, y) == true) {
			return true;
		}
		// down
		if (y < 7 && possibleMove(x, y + 1) == true) {
			return true;
		}
		// up
		if (y > 0 && possibleMove(x, y - 1) == true) {
			return true;
		}
		return false;
	}

}
