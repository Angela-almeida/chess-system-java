package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) { //inicialmente a posição é 0 por isso, não entra para o construtor

		this.board = board;
		position = null; //esta linha não é obrigatória
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) { //este método contreto está a utilizar o método abstrato possibleMoves(
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
