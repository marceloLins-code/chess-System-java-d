package application;

import chess.ChassMatch;

public class Program {

	public static void main(String[] args) {
		
		ChassMatch chassMatch = new ChassMatch();
		UI.printBoard(chassMatch.getPieces());
		
		

	}

}
	