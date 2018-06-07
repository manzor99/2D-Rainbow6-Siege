package game;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;

public class GameFrame extends JFrame{
	Canvas canvas;
	public GameFrame(int width, int height) {
		super();
		
		canvas = new Canvas();
		canvas.setSize(width, height);
		canvas.setBackground(Color.BLUE);
		
		this.setSize(width, height);
		this.setResizable(false);
		this.add(canvas);
		this.setTitle("2D-Rainbow6-Siege");
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GameFrame frame = new GameFrame(900, 600);
	}
	
}
