package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import characters.Direction;
import characters.Character;
public class Game{
	boolean teamOneOnOffense; //is team 1 on offense?
	public Team one; 
	public Team two;
	
	public Game() {
		one = new Team();
		two = new Team();
	}
	

	private class GameTimer extends Timer{

		public GameTimer(int delay, ActionListener listener) {
			super(delay, listener);
			// TODO Auto-generated constructor stub
		}
		
		public void actionPerformed(ActionEvent e) {
			//this is what happens when there is a tick
			
		}
		
	}
	
	/*
	 * updates the characters location
	 * */
	private void updateCharacterLocations() {}
	
	/*
	 * returns true if the game is over and false if not
	 * @return returns if the game is over
	 * */
	private boolean gameOver() {
		return false;
	}
	
	/*
	 * moves the character in the given direction
	 * @param the character to be moved
	 * @param the direction to move the character
	 * */
	public void moveCharacter(Character c, Direction d) {
		switch(d) {
		case LEFT:
			c.move(Direction.LEFT);
			break;
		case DOWN:
			c.move(Direction.DOWN);
			break;
		case RIGHT:
			c.move(Direction.RIGHT);
			break;
		case UP:
			c.move(Direction.UP);
			break;
		}
	}
	
}
