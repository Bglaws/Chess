

public class Pawn extends Piece {

	public Pawn(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}
	boolean isFirstMove = true;

	@Override
	
	/* possibleMove() will temporarily move the selected piece (if its a legal move)
	 * and check to see if the move puts its own team in check. If it does, than
	 * the move is illegal.
	 */
	public boolean possibleMove(int x, int y) {
		//TODO en passant, promotion
		
		   if (this.getColor() == Color.WHITE) {

			      // 2 spaces forward
			      if (isFirstMove == true &&
			          this.getY() - y == -2 &&
			          this.getX() - x == 0 &&
			          Board.getSpot(x, y) == null) {
			    	  System.out.println("valid move yerrrrr");
			          return true;
			      }
			      // 1 space forward
			      if (this.getY() - y == -1 &&
			          this.getX() - x == 0 &&
			          Board.getSpot(x, y) == null) {
			          return true;
			      }

			      // diagonal
			      if (this.getY() - y == -1 &&
			          Math.abs(this.getX() - x) == 1 &&
			          Board.getSpot(x, y) != null &&
			          this.sameColor(Board.getSpot(x, y)) == false) {
			          return true;
			      }
			    }

		   if (this.getColor() == Color.BLACK) {

			      // 2 spaces forward
			      if (isFirstMove == true &&
			          this.getY() - y == 2 &&
			          this.getX() - x == 0 &&
			          Board.getSpot(x, y) == null) {
			        return true;
			      }
			      // 1 space forward
			      if (this.getY() - y == 1 &&
			          this.getX() - x == 0 &&
			          Board.getSpot(x, y) == null) {
			        return true;
			      }

			      // diagonal
			      if (this.getY() - y == 1 &&
			          Math.abs(this.getX() - x) == 1 &&
			          Board.getSpot(x, y) != null &&
			          this.sameColor(Board.getSpot(x, y)) == false) {
			        return true;
			      }
			    }
		System.out.println("invalid move yo");
		return false;
	}
	
	@Override
	public int move(int x, int y) {
				
		if (possibleMove(x,y)) {
			Board.setSpot(getX(),getY(), null);
			Board.setSpot(x, y, this);
			return 0;
		}
		return -1;
		
				
	}

}

