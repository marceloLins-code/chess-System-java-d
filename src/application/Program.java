package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChassMatch;
import chess.ChessException;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChassMatch chassMatch = new ChassMatch();
		
		while (true) {
			try{
			UI.clearScreen();
			UI.printBoard(chassMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chassMatch.performChessMove(source, target);
			}
			catch(InputMismatchException e){
				System.out.println(e.getMessage());
				sc.nextLine();
				 
				
			}
		}
	}
}