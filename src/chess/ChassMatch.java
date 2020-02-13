package chess;

import boardgame.Board;
import chess.pieces.Rook;
import chess.pieces.King;

public class ChassMatch {
	private Board board;
	
	public ChassMatch(){
		board = new Board(8, 8);
		initialSetup();
	}
	// construindo e retornando a matriz de peças do xadrez
	public ChessPiece[][] getPieces(){ 
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()]; // criou o tamanho
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) { // percorre
				  mat[i][j]=(ChessPiece)board.piece(i,j);				
			}
		}
		return mat;
		
	}	
	private void placeNewPiece(char column, int row,  ChessPiece piece){
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
		
	}
	
		
	public void initialSetup(){
		placeNewPiece('b',6, new Rook(board, Color.WHITE));
		placeNewPiece('e',8, new King(board, Color.WHITE));
		placeNewPiece('e',1, new King(board, Color.WHITE));

		// board.placePiece(piece, position);
		

	}

}
