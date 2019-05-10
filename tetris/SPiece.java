package tetris;

import java.awt.Color;


public class SPiece extends Piece{
	public SPiece() {
		super();
		myColor = Color.GREEN;
		x = 5;
		y = 5;
		projection[0][0] = -1;
		projection[0][1] = 0;
		projection[1][0] = 1;
		projection[1][1] = -1;
		projection[2][0] = 0;
		projection[2][1] = -1;
		
		
	}
}
