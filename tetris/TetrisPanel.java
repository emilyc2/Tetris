package tetris;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TetrisPanel extends JPanel{
	Tetris parent;
	public TetrisPanel(Tetris t) {
		parent = t;
	}
	@Override 
	public void paint(Graphics g) {
		super.paint(g);
		for(int row=parent.getOFF_SCREEN(); row<parent.getBOARD_HEIGHT(); row++) {
			for(int column = 0; column<parent.getBOARD_WIDTH(); column++) {
				g.setColor(Color.WHITE);

				g.drawRect(column*parent.getTILE_WIDTH(), (row-parent.getOFF_SCREEN())*parent.getTILE_WIDTH(), parent.getTILE_WIDTH(), parent.getTILE_WIDTH());

				g.setColor(parent.getBoard().colorAt(row, column));
				g.fillRect(column*parent.getTILE_WIDTH(), (row-parent.getOFF_SCREEN())*parent.getTILE_WIDTH(), parent.getTILE_WIDTH(), parent.getTILE_WIDTH());
			}
		}
		
		
	}
	
}
