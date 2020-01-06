package boardgame;

public class Piece {
	
//	protected: To be accessed only by classes within the same package or subclasses
	
	protected Position position;
	private Board board;
	
	public Piece() {
		
	}
	
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	

}
