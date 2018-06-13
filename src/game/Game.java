package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import characters.Character;
import characters.Direction;
import maps.Map;
import terrain.Wall;
import terrain.Window;
public class Game{
	boolean teamOneOnOffense; //is team 1 on offense?
	public Team one; 
	public Team two;
	public Map map;
	
	public Game() {
		one = new Team();
		two = new Team();
		map = new Map();
		map.walls.add(new Wall(1000, 10, 100, 200));
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
			c.setLocation(c.x - c.speed, c.y);
			if(collides(c)) {
				c.setLocation(c.x + c.speed, c.y);
			}
			break;
		case DOWN:
			c.setLocation(c.x, c.y + c.speed);
			if(collides(c)) {
				c.setLocation(c.x, c.y - c.speed);
			}
			break;
		case RIGHT:
			c.setLocation(c.x + c.speed, c.y);
			if(collides(c)) {
				c.setLocation(c.x - c.speed, c.y);
			}
			break;
		default:
			c.setLocation(c.x, c.y - c.speed);
			if(collides(c)) {
				c.setLocation(c.x, c.y + c.speed);
			}
			break;
		}
	}
	/*
	 * returns true if a given character collides with anything other than stairs
	 * @param a character
	 * @return true if the character collides with anything other than stairs and false otherwise
	 * */
	private boolean collides(Character c) {
		for(Character player : one.players) {
			if(player != c && c.intersects(player))
				return true;
		}
		for(Character player : two.players) {
			if(player != c && c.intersects(player))
				return true;
		}
		for(Wall w : map.walls) {
			if(c.intersects(w))
				return true;
		}
		for(Window w : map.windows) {
			if(c.intersects(w))
				return true;
		}
		return false;
	}
	
	private void checkStairs() {
		//TODO: add support for stairs
	}
	
}
