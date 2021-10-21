Simple number guessing game written in Java

The program generates a random number between 0 and 100.
The user enters a guess, which must be an integer.  If the guess is correct, the program prints "You win!" and exits. Otherwise, it prints whether the guess was too high or too low. If the user input is anything other than an integer in [0,100], then it prints "You must enter an integer between 0 and 100".
Once the user reaches 50 attempts, the program prints "You lose!" and exits.

RandomTester.java tests a guessing strategy and records results.
In this strategy, the user begins with a floor of 0 and a ceiling of 100 for the correct number.  The strategy is to guess the average of the floor and ceiling and update the floor or ceiling after each guess.
The program loops guessing the average of the floor and ceiling and updating the floor or ceiling with each guess until the correct number is guessed.  The only problem with this strategy is that Java always rounds down when performing integer division, so if the correct number is 100, that strategy by itself would have the program guess 99 until it loses. To handle this, the program guesses 100 instead (floor + ceiling) / 2 if the floor is 99..
The RandomTester program plays this game 100 times and stores the number of guesses it took to win each time to write to a csv file.
TesterPlot.py reads the csv file of results into a numpy array and plots a histogram of the results.
