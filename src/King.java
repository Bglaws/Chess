

public class King extends Piece{

	public King(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	@Override
	public boolean possibleMove(int x, int y) {
		if (this.getColor() == Color.WHITE) {
		   	
			if (this.sameColor(Board.getPiece(x, y)) == true) {
				System.out.println("Cannot capture own piece, invalid move");
				return false;
			}
			
			if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 1) {			   //bishop
				return true;
			}
				
			if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 0 ||
				Math.abs(getX() - x) == 0 && Math.abs(getY() - y) == 1) {//rook
				return true;
			}
		}

	   if (this.getColor() == Color.BLACK) {

		   if (this.sameColor(Board.getPiece(x, y)) == true) {
				System.out.println("Cannot capture own piece, invalid move");
				return false;
			}
			
	   }	   
	   return false;
	}

	@Override
	public String toString() {
		return "K";
	}

	
}

