package guessing_game;

public class Player {
	int number = 0;	// Guessed number goes here
	
	public void guess() {
		number = (int) (Math.random()*10);
		System.out.println("I'm guessing" +number);
	}
}
