package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board (8,8); // dimensão do tabuleiro. 
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece [board.getRows()][board.getColumns()]; //Criação da matriz
		for (int i = 0; i<board.getRows(); i++) { //percorre a matriz do tabuleiro board
			for (int j=0; j<board.getColumns(); j++) {
				mat [i][j] = (ChessPiece) board.piece(i,j);	
			}
		}
		return mat;
	}
}
