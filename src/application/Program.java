package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch ();
		UI.printBoard(chessMatch.getPieces());//Cria��o da classe UI (User Interface) + cria��o do m�todo printBoard
	

	}

}
