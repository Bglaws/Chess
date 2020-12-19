

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
			          this.getY() - y == 2 &&
			          this.getX() - x == 0 &&
			          Board.getPiece(x, y) == null) {
			          return true;
			      }
			      // 1 space forward
			      if (this.getY() - y == 1 &&
			          this.getX() - x == 0 &&
			          Board.getPiece(x, y) == null) {
			          return true;
			      }

			      // diagonal
			      if (this.getY() - y == 1 &&
			          Math.abs(this.getX() - x) == 1 &&
			          Board.getPiece(x, y) != null &&
			          this.sameColor(Board.getPiece(x, y)) == false) {
			          return true;
			      }
			    }

		   if (this.getColor() == Color.BLACK) {

			      // 2 spaces forward
			      if (isFirstMove == true &&
			          this.getY() - y == -2 &&
			          this.getX() - x == 0 &&
			          Board.getPiece(x, y) == null) {
			        return true;
			      }
			      // 1 space forward
			      if (this.getY() - y == -1 &&
			          this.getX() - x == 0 &&
			          Board.getPiece(x, y) == null) {
			        return true;
			      }

			      // diagonal
			      if (this.getY() - y == 1 &&
			          Math.abs(this.getX() - x) == 1 &&
			          Board.getPiece(x, y) != null &&
			          this.sameColor(Board.getPiece(x, y)) == false) {
			        return true;
			      }
			    }
		   return false;
	}
	
	@Override
	public int move(int x, int y, Piece other, Color color) {
		if (this.possibleMove(x, y) != true) {
			return -1;
		}
		
		int originX = this.getX();
		int originY = this.getY();
			
		if (this.getColor() == Color.WHITE) {
			Board.black.remove(other);
		}
		else {
			Board.white.remove(other);
		}
		
		Board.setPiece(originX, originY, null);
		Board.setPiece(x, y, this);
		
		if (Board.checkForCheck(color) == true) {
			if (this.getColor() == Color.WHITE) {
				Board.black.add(other);
			}
			else {
				Board.white.add(other);
			}
			
			Board.setPiece(originX, originY, this);
			Board.setPiece(x, y, other);
			System.out.println("invalid move: cannot put yourself in check.");
			return -1;
		}
		
		return 0;
	}

	@Override
	public String toString() {
		return "P";
	}

}

