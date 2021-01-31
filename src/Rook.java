
public class Rook extends Piece {

	public Rook(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	boolean isFirstMove = true;

	@Override
	public boolean possibleMove(int x, int y) {

		if (this.sameColor(Board.getPiece(x, y)) == true) {
			System.out.println("Cannot capture own piece, invalid move");
			return false;
		}

		if (Math.abs(getX() - x) != 0 && Math.abs(getY() - y) != 0) {
			return false;
		}

		if (Board.isPathClear(getX(), getY(), x, y)) {
			isFirstMove = false;
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
		// TODO Auto-generated method stub
		return false;
	}

}
