package tetris;

import java.awt.Color;

public class Board {
	Tetris parent;
	Piece activePiece;
	Tile[][] board = new Tile[22][10];
	public Board(Tetris tet){
		parent = tet;
		for(int row = parent.getOFF_SCREEN(); row<board.length;row++) {
			for(int column = 0; column <board[row].length; column++) {
				board[row][column]= new Tile();

			}
		}
		startPiece();
	}
	public Tile[][] getMyBoard() {
		return board;
	}
	public void startPiece() {
		activePiece = new TPiece(this);
	}
	public Piece getActivePiece() {
		return activePiece;
	}
	public Color colorAt(int row, int column) {
		if(activePiece.getX() == column && activePiece.getY() == row) 
			return activePiece.getColor();
		for(int i =0; i<3; i++) {
			if(activePiece.getProjectionX(i) == column && activePiece.getProjectionY(i)==row) {
				return activePiece.getColor();

			}
		}
		return board[row][column].getColor();
		
	}
	public void stop() {
		board[activePiece.getY()][activePiece.getX()].setColor(activePiece.getColor());
		board[activePiece.getY()][activePiece.getX()].setActive(true);
		for(int i =0; i<3; i++) {
			board[activePiece.getProjectionY(i)][activePiece.getProjectionX(i)].setColor(activePiece.getColor());
			board[activePiece.getProjectionY(i)][activePiece.getProjectionX(i)].setActive(true);
		}
		activePiece = new SPiece(this);
	}
}
