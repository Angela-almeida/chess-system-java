package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch ();
		UI.printBoard(chessMatch.getPieces());//Criação da classe UI (User Interface) + criação do método printBoard
	

	}

}
