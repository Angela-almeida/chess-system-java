package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) { //inicialmente a posi��o � 0 por isso, n�o entra para o construtor

		this.board = board;
		position = null; //esta linha n�o � obrigat�ria
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) { //este m�todo contreto est� a utilizar o m�todo abstrato possibleMoves(
		return possibleMoves()[position.getRow()][position.getColumn()];	
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i < mat.length; i++) {
			for (int j=0; j < mat.length; j++) {
				if (mat [i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
