package application;

import chess.ChessPiece;

public class UI { //interface do usuario, 
	// print chess board, tabuleiro da camada chess
	public static void printBoard(ChessPiece[][] pieces){ 
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8-i)+" ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
				
			}
			System.out.println();
		}		
		System.out.print("  a b c d e f g h");
	}
	//  usabdo  chesspiece, matriz de peças da Classe Chessmatch
	public static void printPiece(ChessPiece piece){
		if (piece==null) {
			System.out.print("-");
		}else{
			System.out.print(piece);		
	}
	System.out.print(" ");	
	}
}


