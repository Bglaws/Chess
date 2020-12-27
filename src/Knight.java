

public class Knight extends Piece {

	public Knight(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	@Override
	public boolean possibleMove(int x, int y) {
		if (this.getColor() == Color.WHITE) {
		   	
			if (this.sameColor(Board.getPiece(x, y)) == true) {
				System.out.println("Cannot capture own piece, invalid move");
				return false;
			}
			
			if (Math.abs(this.getY() - y) == 2 &&
				Math.abs(this.getX() - x) == 1 ||
				Math.abs(this.getY() - y) == 1 &&
				Math.abs(this.getX() - x) == 2) {
		        return true;
		    }
		}

	   if (this.getColor() == Color.BLACK) {

		   if (this.sameColor(Board.getPiece(x, y)) == true) {
				System.out.println("Cannot capture own piece, invalid move");
				return false;
			}
			
			if (Math.abs(this.getY() - y) == 2 &&
				Math.abs(this.getX() - x) == 1 ||
				Math.abs(this.getY() - y) == 1 &&
				Math.abs(this.getX() - x) == 2) {
		        return true;
		    }
	   }
	   return false;
	}
	
	@Override
	public String toString() {
		return "K";
	}


}

