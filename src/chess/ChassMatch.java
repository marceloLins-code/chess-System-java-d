package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

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
	
	public void initialSetup(){
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));

	}

}
