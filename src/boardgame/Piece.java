package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) { //inicialmente a posição é 0 por isso, não entra para o construtor

		this.board = board;
		position = null; //esta linha não é obrigatória
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	

}
