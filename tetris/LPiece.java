package tetris;

import java.awt.Color;


public class LPiece extends Piece{
	public LPiece(Board board) {
		super(board);
		myColor = Color.ORANGE;
		x = 5;
		y = 5;
		projection[0][0] = -1;
		projection[0][1] = 0;
		projection[1][0] = 1;
		projection[1][1] = 0;
		projection[2][0] = 1;
		projection[2][1] = -1;
		
		
	}
}
