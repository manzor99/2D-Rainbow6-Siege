package game;

import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame extends JFrame{
	JPanel panel;
	public GameFrame(int width, int height) {
		super();
		this.setLayout(null);
		panel = new JPanel();
		panel.setSize(width, height);
		panel.setLayout(null);
		//panel.setBackground(Color.BLUE);
		
		this.setSize(width, height);
		this.setResizable(false);
		this.add(panel);
		this.setTitle("2D-Rainbow6-Siege");
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GameFrame frame = new GameFrame(900, 600);
	}
	
}
