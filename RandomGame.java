public class RandomGame {
	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 101);
		int numGuesses = 0;
		boolean correct = false;
		do {			
			numGuesses++;
			// get user input
			System.out.println("Enter your guess: ");
			GetInput userGuess = new GetInput();
			// check if correct
			correct = userGuess.guess == randomNumber;
			if (correct) {
				System.out.println("You win!");
			} else if (numGuesses < 100) {
				if (userGuess.guess > randomNumber) {
					System.out.println("Too high");
				} else {
					System.out.println("Too low");
				}
			} else {
				System.out.println("You lose!");
				break;
			}
		}
		while (! correct);

	}
}
