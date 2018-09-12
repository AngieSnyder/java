import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller!");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Roll the dice? (y/n): ");
		String choice =sc.next();
		while (choice.equalsIgnoreCase("y")) {
			Dice d = new Dice();
			System.out.println(d);
			
			System.out.print("Roll again? (y/n): ");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye");
	}

}
