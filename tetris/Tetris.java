package tetris;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Tetris {
	public Board myBoard;
	
	final int BOARD_WIDTH = 10;
	final int BOARD_HEIGHT = 22;
	final int TILE_WIDTH = 30;
	final int OFF_SCREEN = 2;
	public Tetris(){
		myBoard = new Board(this);
		
	}
	public static void main (String[] args) {
		
		Tetris tetris= new Tetris();
		TetrisPanel tetrisPanel;
		JFrame frame = new JFrame();
		frame.setSize(tetris.getBOARD_WIDTH()*tetris.getTILE_WIDTH(),(tetris.getBOARD_HEIGHT()-tetris.getOFF_SCREEN())*tetris.getTILE_WIDTH()+22);
		tetrisPanel = new TetrisPanel(tetris);
		tetris.attach(tetrisPanel);
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					tetris.getBoard().getActivePiece().translate(1);
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					tetris.getBoard().getActivePiece().translate(-1);
				}
				tetrisPanel.repaint();
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.getContentPane().add(tetrisPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void attach(TetrisPanel panel) {
		Timer downTimer = new Timer();
		downTimer.schedule(new TimerTask() {

			@Override
			public void run() {
				boolean iStopped = false;
				if(getBoard().activePiece.getY() ==BOARD_HEIGHT-1 || getBoard().getMyBoard()[getBoard().activePiece.getY()+1][getBoard().getActivePiece().getX()].isActive() == true) {
					getBoard().stop();
					iStopped = true;
				}
				for(int i =0; i<3; i++) {
					if(getBoard().activePiece.getProjectionY(i) == BOARD_HEIGHT-1|| getBoard().getMyBoard()[getBoard().activePiece.getProjectionX(i)+1][getBoard().getActivePiece().getProjectionX(i)].isActive() == true) {
						getBoard().stop();
						iStopped = true;
					}
				}
				if(iStopped == false) {
				
					getBoard().getActivePiece().moveDown();
				}
				panel.repaint();
				
			}
			
		},0,1000);
	}
	public int getBOARD_WIDTH() {
		return BOARD_WIDTH;
	}
	public int getBOARD_HEIGHT() {
		return BOARD_HEIGHT;
	}
	public int getTILE_WIDTH() {
		return TILE_WIDTH;
	}
	public Board getBoard() {
		return myBoard;
	}
	public int getOFF_SCREEN() {
		return OFF_SCREEN;
	}
}
