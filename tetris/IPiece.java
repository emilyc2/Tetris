package tetris;

import java.awt.Color;


public class IPiece extends Piece{
	public IPiece(Board board) {
		super(board);
		myColor = Color.CYAN;
		x = 5;
		y = 5;
		projection[0][0] = -1;
		projection[0][1] = 0;
		projection[1][0] = 1;
		projection[1][1] = 0;
		projection[2][0] = 2;
		projection[2][1] = 0;
		
		
	}
}