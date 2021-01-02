

public class King extends Piece{

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
			
			if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 1) {	//bishop
				isFirstMove = false;
				return true;
			}
				
			if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 0 ||
				Math.abs(getX() - x) == 0 && Math.abs(getY() - y) == 1) {	//rook
				isFirstMove = false;
				return true;
			}
		}

	   if (this.getColor() == Color.BLACK) {

		   if (this.sameColor(Board.getPiece(x, y)) == true) {
				System.out.println("Cannot capture own piece, invalid move");
				return false;
			}
		   if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 1) {	//bishop
				isFirstMove = false;
				return true;
			}
				
			if (Math.abs(getX() - x) == 1 && Math.abs(getY() - y) == 0 ||
				Math.abs(getX() - x) == 0 && Math.abs(getY() - y) == 1) {	//rook
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

	public int castle(String side, Color c) {
		
		Rook rook = (Rook) Board.getPiece("rook" + side, c);
		
		if (this.isFirstMove != true || rook.isFirstMove != true ||
			Board.isPathClear(this.getX(),this.getY(),rook.getX(),rook.getY()) != true) {
			System.out.println("Cannot castle if king or rook has already moved");
			return -1;
		}
		
		if (c == Color.WHITE) {
			
			if (side == "K") {
				Board.setPiece(5, 0, rook);
				Board.setPiece(6, 0, this);
			}
			
			else if (side == "Q") {
				Board.setPiece(3, 0, rook);
				Board.setPiece(2, 0, this);
			}
		}
		if (c == Color.BLACK) {

			if (side == "K") {
				Board.setPiece(3, 7, rook);
				Board.setPiece(2, 7, this);
			}

			else if (side == "Q") {
				Board.setPiece(3, 7, rook);
				Board.setPiece(2, 7, this);
			}
		}
		
		
		return 0;
		
	}
	
}

