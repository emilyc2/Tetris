package tetris;

import java.awt.Color;

public class Piece {
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
		
	}
	public void translate(int n) {
		x+=n;
	}
	public void drop() {
		
	}
	public void rotate() {
		
	}
	

}
