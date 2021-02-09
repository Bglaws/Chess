
public class Pawn extends Piece {

	public Pawn(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	boolean isFirstMove = true;

	@Override
	public boolean possibleMove(int x, int y) {
		// TODO en passant

		// somewhere in here
		if (this.getColor() == Color.WHITE) {

			// 2 spaces forward
			if (this.isFirstMove == true && this.getY() - y == 2 && this.getX() - x == 0
					&& Board.isPathClear(getX(), getY(), x, y) && Board.getPiece(x, y) == null) {
				return true;
			}
			// 1 space forward
			if (this.getY() - y == 1 && this.getX() - x == 0 && Board.getPiece(x, y) == null) {
				return true;
			}

			// diagonal
			if (this.getY() - y == 1 && Math.abs(this.getX() - x) == 1 && Board.getPiece(x, y) != null
					&& this.sameColor(Board.getPiece(x, y)) == false) {
				return true;
			}
		}

		if (this.getColor() == Color.BLACK) {
			// 2 spaces forward
			if (this.isFirstMove == true && this.getY() - y == -2 && this.getX() - x == 0
					&& Board.isPathClear(getX(), getY(), x, y) && Board.getPiece(x, y) == null) {
				return true;
			}
			// 1 space forward
			if (this.getY() - y == -1 && this.getX() - x == 0 && Board.getPiece(x, y) == null) {
				return true;
			}

			// diagonal
			if (this.getY() - y == -1 && Math.abs(this.getX() - x) == 1 && Board.getPiece(x, y) != null
					&& this.sameColor(Board.getPiece(x, y)) == false) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		if (this.getColor() == Color.WHITE) {
			return "♙";
		}
		return "♟";
	}

	@Override
	public boolean canMove() {
		int x = this.getX();
		int y = this.getY();

		int originX = x;
		int originY = y;
		Piece other;
		boolean isFirst = this.isFirstMove;

		if (this.getColor() == Color.WHITE) {
			other = Board.getPiece(x, y - 1);

			if (this.move(x, y - 1, other) == 0) {
				
				Board.setPiece(originX, originY, other);
				Board.setPiece(originX, originY, this);
				isFirst = this.isFirstMove;
				if (other != null){
					Board.black.add(other);
				}
				return true;
			}
			other = Board.getPiece(x, y - 2);
			if (this.move(x, y - 2, other) == 0) {
				
				Board.setPiece(originX, originY, other);
				Board.setPiece(originX, originY, this);
				isFirst = this.isFirstMove;
				if (other != null){
					Board.black.add(other);
				}
				return true;
			}
			other = Board.getPiece(x - 1, y - 1);
			if (this.move(x - 1, y - 1, other) == 0) {

				Board.setPiece(originX, originY, other);
				Board.setPiece(originX, originY, this);
				isFirst = this.isFirstMove;
				if (other != null){
					Board.black.add(other);
				}
				return true;
			}
			other = Board.getPiece(x + 1, y - 1);
			if (this.move(x + 1, y - 1, other) == 0) {
				
				Board.setPiece(originX, originY, other);
				Board.setPiece(originX, originY, this);
				isFirst = this.isFirstMove;
				if (other != null){
					Board.black.add(other);
				}
				return true;
			}
		}
		if (this.getColor() == Color.BLACK) {
			other = Board.getPiece(x, y + 1);

			if (this.move(x, y + 1, other) == 0) {
				
				Board.setPiece(originX, originY, other);
				Board.setPiece(originX, originY, this);
				isFirst = this.isFirstMove;
				if (other != null){
					Board.black.add(other);
				}
				return true;
			}
			other = Board.getPiece(x, y + 2);
			if (this.move(x, y + 2, other) == 0) {

				Board.setPiece(originX, originY, other);
				Board.setPiece(originX, originY, this);
				isFirst = this.isFirstMove;
				if (other != null){
					Board.black.add(other);
				}
				return true;
			}
			other = Board.getPiece(x - 1, y + 1);
			if (this.move(x - 1, y + 1, other) == 0) {

				Board.setPiece(originX, originY, other);
				Board.setPiece(originX, originY, this);
				isFirst = this.isFirstMove;
				if (other != null){
					Board.black.add(other);
				}
				return true;
			}
			other = Board.getPiece(x + 1, y + 1);
			if (this.move(x + 1, y + 1, other) == 0) {
				
				Board.setPiece(originX, originY, other);
				Board.setPiece(originX, originY, this);
				isFirst = this.isFirstMove;
				if (other != null){
					Board.black.add(other);
				}
				return true;
			}
		}

		return false;
	}

}
