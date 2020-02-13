package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; 
	}	// o tabuleiro deve ter uma pe�a, at� para informa��o

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	//  cria o tamanho da matriz pe�a
	public Piece piece(int row , int column){
		return pieces [row][column];
	}
	//
	public Piece piece(Position position){
		return pieces[position.getRow()][position.getColumn()];
	}
	// aloca pe�a no tabuleiro
	public void placePiece(Piece piece, Position position){
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	
	
	
	
}
