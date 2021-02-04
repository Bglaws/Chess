
public abstract class Piece {

	private final Color color;

	private final String ID;

	/* the current location of this piece */
	private int x, y;

	private boolean isFirstMove;

	/*
	 * Piece constructor that should only be called from child class constructor
	 */
	public Piece(Color color, String ID, int startX, int startY) {
		this.color = color;
		this.ID = ID;
		this.x = startX;
		this.y = startY;

		if (this.getColor() == Color.WHITE) {
			Board.white.add(this);
		} else if (this.getColor() == Color.BLACK) {
			Board.black.add(this);
		}
		Board.setPiece(x, y, this);
	}

	/*
	 * these do not need to change as they will be consistent across all piece types
	 */
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
		if (otherPiece == null) {
			return false;
		}
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

	public int move(int x, int y, Piece other, Color color) {
		if (this.possibleMove(x, y) != true) {
			return -1;
		}
		int originX = this.getX();
		int originY = this.getY();

		if (this.getColor() == Color.WHITE) {
			Board.black.remove(other);
		} else {
			Board.white.remove(other);
		}

		Board.setPiece(originX, originY, null);
		Board.setPiece(x, y, this);

		if (this instanceof King || this instanceof Rook) {
			this.isFirstMove = false;
		}

		if (Board.checkForCheck(color) == true) {
			if (this.getColor() == Color.WHITE) {
				Board.black.add(other);
			} else {
				Board.white.add(other);
			}

			Board.setPiece(originX, originY, this);
			Board.setPiece(x, y, other);
			System.out.println("invalid move: cannot put yourself in check.");
			if (this instanceof King || this instanceof Rook) {
				this.isFirstMove = true;
			}

			return -1;
		}

		if (this instanceof Pawn) {
			char file = this.getID().charAt(4);
			if (this.getColor() == Color.WHITE && y == 0) {
				Board.setPiece(x, y, null);
				Board.white.remove(this);
				Queen yasQueen = new Queen(Color.WHITE, "queen" + file, x, y);
				System.out.println("Pawn promoted!");
			} else if (this.getColor() == Color.BLACK && y == 7) {
				Board.setPiece(x, y, null);
				Board.black.remove(this);
				Queen yasQueen = new Queen(Color.BLACK, "queen" + file, x, y);
				System.out.println("Pawn promoted!");
			}
		}

		return 0;
	}

	public String nullToString() {
		return "   ";
	}

	public abstract String toString();

	public abstract boolean canMove();
}
