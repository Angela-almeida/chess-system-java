package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces; //pieces � o nome da matriz
	
	public Board(int rows, int columns) {

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
		return pieces [row][column];
	}
	
	public Piece piece (Position position) { //sobrecarga do metodo anterior
		return pieces [position.getRow()][position.getColumn()];
	}
	
	

}
