package tetris;

import java.awt.Color;

public class Tile {
	private boolean isOccupied = false;
	private boolean active = false;
	private Color color = Color.BLACK;
	public Tile() {
		System.out.println("WHY DO I HAVE ERRORS?");
	}
	public boolean isOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
