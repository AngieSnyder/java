import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Welcome Statement
		System.out.println();
		System.out.println("Tip Calculator");
		System.out.println();
		
		// Prompt user input 
		while (choice.equalsIgnoreCase ("y")) {
			System.out.print("Cost of Meal: ");
			double cost = sc.nextDouble();
			System.out.println();
			
		// Calculate tip amounts
			
			BigDecimal tipAmount = new BigDecimal(tipAmount);
			tipAmount = tipAmount.setScale(2, RoundingMode.HALF_UP)
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Goodbye");
		sc.close();

	}

}
