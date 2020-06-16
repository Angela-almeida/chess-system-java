package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces; //pieces é o nome da matriz
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns <1 ) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");//excepção personalizada
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns]; //a matriz vai ser instanciada de acordo com os dados introduzidos para linha e coluna
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece (int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException ("Position not on the board");
		}
		return pieces [row][column];
	}
	
	public Piece piece (Position position) { //sobrecarga do metodo anterior
		if(!positionExists(position)) {
			throw new BoardException ("Position not on the board");
		}
		return pieces [position.getRow()][position.getColumn()];
	}
	
	public void placePiece (Piece piece, Position position) { // a peça já não está na posição nula. está na position
		if (thereIsAPiece(position)) { //antes de colocar uma peça nesta posição, é necessário verificar se já há alguma peça lá
			throw new BoardException ("There is already a piece on position" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists (int row, int column) { //a posição existe quando está dentro do tabuleiro
		return row >=0 && row < rows && column >= 0  && column < columns; //condição para verificar se a posição existe
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (thereIsAPiece(position)) { //verifica se a posição existe
			throw new BoardException ("There is already a piece on position" + position);
		}
		return piece(position) != null;
	}
	

}
