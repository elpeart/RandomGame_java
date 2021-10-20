import java.util.Scanner;

public class GetInput {
	int guess;
	Scanner obj = new Scanner(System.in);
	public GetInput() {
		try {
			guess = obj.nextInt();
		} catch (Exception e) {
			guess = 101;
		}
	}

}
