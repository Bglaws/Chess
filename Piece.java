

public abstract class Piece {
	
		
	public static String player;	
	
	private final Color color;
	
	private final String ID;

	  /* the current location of this piece */
	  private int x, y;

	  /* Piece constructor that should only be called
	     from child class constructor */
	  public Piece(Color color, String ID, int startX, int startY) {
	    this.color = color;
	    this.ID = ID;
	    this.x = startX;
	    this.y = startY;
	  }

	  /* these do not need to change as they will
	     be consistent across all piece types */
	  public String getID() {
	    return this.ID;
	  }

	  public boolean matchID(String ID) {
	    return this.ID.equals(ID);
	  }

	  public Color getColor() {
	    return this.color;
	  }

	  public boolean sameColor(Piece otherPiece) {
	    return (this.color == otherPiece.getColor());
	  }

	  public int getX() {
	    return this.x;
	  }

	  void setX(int newX) {
	    this.x = newX;
	  }

	  public int getY() {
	    return this.y;
	  }
	  

	  void setY(int newY) {
	    this.y = newY;
	  }

	  public abstract boolean possibleMove(int x, int y);
	  public abstract int move(int x, int y);
	 
		
}

