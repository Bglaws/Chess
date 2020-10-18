
class Pieces {
	
	public static String player;
	
	
	
	static boolean isWhite() {
		return false;
		
	}
	
	public static boolean getPiece(String piece) {
		
		if (piece.equals("pawnA") || piece.equals("PawnA")) return true; 
		if (piece.equals("pawnB") || piece.equals("PawnB")) return true;
		if (piece.equals("pawnC") || piece.equals("PawnC")) return true;
		if (piece.equals("pawnD") || piece.equals("PawnD")) return true;
		if (piece.equals("pawnE") || piece.equals("PawnE")) return true;
		if (piece.equals("pawnF") || piece.equals("PawnF")) return true;
		if (piece.equals("pawnG") || piece.equals("PawnG")) return true;
		if (piece.equals("pawnH") || piece.equals("PawnH")) return true;
		
		if (piece.equals("bishopQ") || piece.equals("BishopQ")) return true;
		if (piece.equals("bishopK") || piece.equals("BishopK")) return true;
		if (piece.equals("knightQ") || piece.equals("KnightQ")) return true;
		if (piece.equals("knightK") || piece.equals("KnightK")) return true;
		if (piece.equals("rookQ") || piece.equals("RookQ")) return true;
		if (piece.equals("rookK") || piece.equals("RookK")) return true;
		if (piece.equals("queen") || piece.equals("Queen")) return true;
		if (piece.equals("king") || piece.equals("King")) return true;
		
		
		System.out.println("invalid piece, please type in full name of piece to move it.");
		System.out.println("For pawns, type in \"pawn\" or \"Pawn\" followed by the file letter");
		System.out.println("For bishops, knights and rooks, put \"Q\" or \"K\" to specify whichside");
		System.out.println("Example: PawnA, bishopQ");
		return false;
		
	}
	

	public class Pawn {
		
		private String Pawn;

		public Pawn() {
			this.setPawn("P");
		}
			
		public String getPawn() {
			return Pawn;
		}

		public void setPawn(String pawn) {
			Pawn = pawn;
		}

		boolean isFirstMove = true;
		
		
	}
	
	public class Bishop{
		
		
		
	}
	
	public class Knight {
		
		
		
	}
	
	public class Rook {
		
		
		
	}
	
	public class Queen {
		
		
		
	}

	public class King {
		
		
		
	}
	
	

