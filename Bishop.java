

public class Bishop extends Piece {

	public Bishop(Color color, String ID, int startX, int startY) {
		super(color, ID, startX, startY);
	}

	@Override
	public boolean possibleMove(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public int move(int x, int y, Piece other, Color color) {
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "B";
	}

	

}

