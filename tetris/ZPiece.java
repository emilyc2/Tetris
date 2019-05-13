package tetris;

import java.awt.Color;


public class ZPiece extends Piece{
	public ZPiece(Board board) {
		super(board);
		myColor = Color.RED;
		x = 5;
		y = 5;
		projection[0][0] = 0;
		projection[0][1] = 1;
		projection[1][0] = -1;
		projection[1][1] = 0;
		projection[2][0] = 1;
		projection[2][1] = 1;
		
		
	}
}
