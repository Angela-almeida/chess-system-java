package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) { //inicialmente a posi��o � 0 por isso, n�o entra para o construtor

		this.board = board;
		position = null; //esta linha n�o � obrigat�ria
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	

}
