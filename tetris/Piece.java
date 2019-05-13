package tetris;

import java.awt.Color;

public class Piece {
	Board board;
	public Piece(Board theBoard) {
		board = theBoard;
	}
	int x,y;
	Color myColor;
	int projection[][]= new int [3][2]; 
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Color getColor() {
		return myColor;
	}
	public int getProjectionX(int n){
		
		return x+projection[n][0];
	}
	public int getProjectionY(int n) {
		return y+projection[n][1];
	}
	public void moveDown() {
		y+=1;
	}
	public void translate(int n) {
		if(x+n > board.getMyBoard()[0].length-1||x+n<0) {
			return;
		}
		for(int i =0; i<3; i++) {
			if(getProjectionX(i)+n>board.getMyBoard()[0].length-1||getProjectionX(i)+n<0) {
				return;
			}
		}
		x+=n;
	}
	public void drop() {
		
	}
	public void rotate() {
		
	}
	

}
