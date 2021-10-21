import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RandomTester {
	public static void main(String[] args) {
		ArrayList<Integer> numGuessesArray = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			int randomNumber = (int) (Math.random() * 101);
			int numGuesses = 0;
			int guess;
			boolean correct = false;
			int interval = 25;
			int floor = 0;
			int ceiling = 100;
			do {			
				numGuesses++;
				// get user input
				//System.out.println("Enter your guess: ");
				if (ceiling == 100 && floor == 99) {
					guess = 100;
				} else {
					guess = (ceiling + floor) / 2;
				}
				//System.out.println(guess);
				//GetInput userGuess = new GetInput();
				// check if correct
				correct = guess == randomNumber;
				if (correct) {
					//System.out.println("You win!");
					numGuessesArray.add(numGuesses);
				} else if (numGuesses < 50) {
					if (guess > 100 || guess < 0) {
						//System.out.println("You must enter an integer between 0 and 100");
						numGuessesArray.add(100);
					} else if (guess > randomNumber) {
						//System.out.println("Too high");
						ceiling = guess;
					} else {
						//System.out.println("Too low");
						floor = guess;
					}
				} else {
					//System.out.println("You lose!");
					numGuessesArray.add(numGuesses);
					break;
				}
			}
			while (! correct);
		}
		try {
			FileWriter myWriter = new FileWriter("Results.csv");
			for (int i = 0; i < 99; i++) {
				//System.out.println(i);
				myWriter.write(numGuessesArray.get(i) + ", ");
			}
			myWriter.write(numGuessesArray.get(99).toString());
			myWriter.close();
			System.out.println("Success");
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
	}
}
