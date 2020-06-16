package application;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces ) { //imprimir tabuleiro
		for (int i=0; i<pieces.length; i++) {
			System.out.print((8 - i) + " "); //imprime coluna de numeros do lado esquerdo
			for (int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.print(" a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) { //método auxiliar para imprimir uma peça
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.println(piece);
		}
		System.out.print(" ");
	}
}