import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
	
		// Welcome Message
		System.out.println();
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println();
	}
	// Generate a random # between 1 and 100
		private static int generateRandomNumber() {
			System.out.println("I'm thinking of a number from 1 to 100." + "\n"
					+ "Try to guess it.");
			System.out.println();
			return (int)((Math.random()*100)+1);
			
		
		// while loop for 1 game		
		while (choice.equalsIgnoreCase("Y")) {
			boolean correctGuess = false;
			int theNumber = generateRandomNumber();
			int counter = 0;
			while(!correctGuess) {
				int guess = getInt("Enter number", sc, 1, 100);
				counter++;
				// compare guess vs theNumber
				String resp = "";
				if (guess > theNumber) {
					int diff = guess - theNumber;
					if (diff > 10) {
						resp = "Way too high!";	
					}
					else {
						resp = "Too high!";
					}
				}
				else if (guess < theNumber) {
					int diff = guess - theNumber;
					if (diff > 10) {
						resp = "Way too low!";	
					}
					else {
						resp = "Too low!";
					}
				}
				else {
					resp = "You got it in "+counter+"| tries";
					correctGuess = true;
				}
			}
			//use the counter to determining the correct message to display
			if (counter <= 3) {
				System.out.println("Great work you are a mathimatical wizard.");
			}
			else if (counter < 7) {
				System.out.println("Not too bad! You've got some potential.");
			}
			else {
				System.out.println("What took you so long Maybe you sould take some lessons.");
			}
			
			System.out.print("Try Again? y/n: ");
			choice = sc.next();
			System.out.println();
		
		System.out.println();
		System.out.println("Bye - Come back soon!");
		sc.close();
	}

	private static int getInt(String prompt, Scanner scan) {
		System.out.println(prompt);
		int n = 0;
		boolean isValid = false;
		while (!isValid) {
			if (scan.hasNextInt()) {
				n = scan.nextInt();
			}
			else {
				System.out.println("Please enter a valid integer.");
			}
		}
		return n;
	}
	
	private static int getInt(String prompt, Scanner scan, int min, int max) {
		System.out.println(prompt);
		int n = getInt(prompt,scan);
		boolean isValid = false;
		while (!isValid) {
			if (n < min) {
				System.out.println("Number below minimum(+min+)");
			}
			else if (n > max) {
				System.out.println("Number above maximum(+max+)");
			}
		}
		return n;
	}
	
}}

