package tetris;

import java.awt.Color;


public class TPiece extends Piece{
	public TPiece(Board board) {
		super(board);
		myColor = Color.MAGENTA;
		x = 5;
		y = 5;
		projection[0][0] = 0;
		projection[0][1] = -1;
		projection[1][0] = -1;
		projection[1][1] = 0;
		projection[2][0] = 1;
		projection[2][1] = 0;
		
		
	}
}
