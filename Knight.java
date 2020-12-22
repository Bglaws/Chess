

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
		return "K";
	}


}

