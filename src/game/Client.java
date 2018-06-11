package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.WindowConstants;

import characters.Character;
import characters.Direction;
import characters.Tachanka;

public class Client {

	GameFrame frame; //add the timer and key listener to the frame
	Character player;
	
	public Client(GameFrame frame, Character player) {
		this.frame = frame;
		this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.player = player;
		this.frame.panel.add(player.label);
		KeyboardHandler listener = new KeyboardHandler();
		this.frame.addKeyListener(listener);
		frame.panel.repaint();

	}
	
	private class KeyboardHandler implements KeyListener{

		public KeyboardHandler() {
			super();
		}
		
		@Override
		public void keyPressed(KeyEvent key) { //if a key is held down
			if(key.getKeyCode() == KeyEvent.VK_W) {
				player.move(Direction.UP);
			}
			else if(key.getKeyCode() == KeyEvent.VK_A) {
				player.move(Direction.LEFT);
			}
			else if(key.getKeyCode() == KeyEvent.VK_S) {
				player.move(Direction.DOWN);
			}
			else if(key.getKeyCode() == KeyEvent.VK_D) {
				player.move(Direction.RIGHT);
			}
		}

		@Override
		public void keyReleased(KeyEvent key) { //when a key is released
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent key) { //when a key is typed aka only occurs once even if you hold the key down
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		Tachanka t = new Tachanka(100, 3, 3, 32, 32, 200, 200, 30, null);
		Client c = new Client(new GameFrame(900, 600), t);
	}
	
}
