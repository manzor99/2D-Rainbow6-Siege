package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Game{
	boolean teamOneOnOffense; //is team 1 on offense?
	Team one; 
	Team two;
	
	public Game() {
		
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
	
}
