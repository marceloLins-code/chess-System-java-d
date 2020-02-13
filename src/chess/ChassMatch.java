package chess;

import boardgame.Board;

public class ChassMatch {
	private Board board;
	
	public ChassMatch(){
		board = new Board(8, 8);
	}
	// retorna a matriz de peças do xadrez
	public ChessPiece[][] getPieces(){ 
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j]=(ChessPiece)board.piece(i,j);
				
			}
		}
		return mat;
		
	}

}
