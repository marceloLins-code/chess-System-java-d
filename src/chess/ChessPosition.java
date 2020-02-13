package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row >8) {
			throw new ChessException(" classe chp: Error instantiatare chess ChessPosition 1 a 8, a . h"); 
		}
		this.column = column;
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	// posi��o de matriz p pposi��o de xadrez
	protected Position toPosition(){
		return new Position(8-row, column - 'a');
	}
	// recebe uma posi��o, converte posi��o de xadrez e retorna a posi��o  
	protected static ChessPosition fromPosition (Position position){
		return new ChessPosition((char)(position.getColumn()-'a'), 8 - position.getRow());
	}
	@Override
	public String toString(){
		return " "+ column + row ;
	}
	
}
