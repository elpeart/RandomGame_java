public class RandomGame {
	static boolean checkResult(int fguess, int fNumber) {
		return fguess == fNumber;
	}
	
	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 101);
		int numGuesses = 0;
		boolean correct = false;
		do {			
			numGuesses++;
			// get user input
			System.out.println("Enter your guess: ");
			int guess = 3;
			// check if correct
			correct = checkResult(guess, randomNumber);
			if (correct) {
				System.out.println("You win!");
			} else if (numGuesses < 100) {
				System.out.println("Try Again");
			} else {
				System.out.println("You lose!");
				break;
			}
		}
		while (! correct);

	}
}
