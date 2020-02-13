package boardgame;

import java.util.prefs.BackingStoreException;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1)  {
			throw new BoardException("Errror creating Board: row > 1, column > 1");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; 
	}	// o tabuleiro deve ter uma pe�a, at� para informa��o

	public int getRows() {
		return rows;
	}	

	public int getColumns() {
		return columns;
	}

	//  cria o tamanho  da matriz pe�a
	// define o length da pe�a sobre o tabuleito
	public Piece piece(int row , int column){
		if (!positionExists (row , column)){
			throw new BoardException("Position not on the board");
		}
		return pieces [row][column];
	}
	// seta, define a posi��o da pe�a
	public Piece piece(Position position){
		if (!positionExists (position)) {
			throw new BoardException("Position not on the board");	
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	// aloca pe�a no tabuleiro
	public void placePiece(Piece piece, Position position){
		if (thereIsSpiece(position)) {
			throw new BoardException(" there is already a piece on position"+position); //BackingStoreException
		}
		// bote essa pe�a aqui, nessa linha e coluna, essa linha e
		// essa linha e essa coluna rece essa pe�a
		pieces[position.getRow()][position.getColumn()] = piece; 
		piece.position = position;
	}
	
	public boolean positionExists(int row, int column){
		return row >= 0 && row < rows && column >= 0 && column < columns ;
	}	
	
	public Boolean positionExists(Position position){
		return positionExists(position.getRow(),position.getColumn());
	}
	
	public boolean thereIsSpiece(Position position){
		if (!positionExists(position)) {
			throw new BoardException(" there is already a piece on position"+position); //BackingStoreException
		}
		return piece (position) !=null;
	}
	
	
	
	
}
