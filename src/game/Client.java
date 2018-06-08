package game;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import characters.Character;
import characters.Tachanka;

public class Client {

	GameFrame frame; //add the timer and key listener to the frame
	Character player;
	
	public Client(GameFrame frame, Character player) {
		this.frame = frame;
		this.player = player;
		player.label.setLocation(450, 300);
		this.frame.panel.add(player.label);

	}
	
	private class KeyboardHandler implements KeyListener{

		@Override
		public void keyPressed(KeyEvent key) { //if a key is held down
			if(key.getKeyCode() == KeyEvent.VK_W) {
				player.setLocation(player.x, player.y - player.speed);
			}
			else if(key.getKeyCode() == KeyEvent.VK_A) {
				player.setLocation(player.x- player.speed, player.y);
			}
			else if(key.getKeyCode() == KeyEvent.VK_S) {
				player.setLocation(player.x, player.y + player.speed);
			}
			else if(key.getKeyCode() == KeyEvent.VK_D) {
				player.setLocation(player.x + player.speed, player.y);
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
		Tachanka t = new Tachanka(100, 1, 3, 30, 30, 30, null);
		Client c = new Client(new GameFrame(900, 600), t);
	}
	
}
