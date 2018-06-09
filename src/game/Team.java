package game;

import characters.Character;
import java.util.ArrayList;

public class Team {
	ArrayList<Character> players; //players on the team
	int score; //number of rounds won
	
	public Team() {
		players = new ArrayList<>();
		score = 0;
	}
	
}
