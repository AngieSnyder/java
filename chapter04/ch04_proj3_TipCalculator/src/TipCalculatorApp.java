import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		// Welcome Statement
		System.out.println();
		System.out.println("Tip Calculator");
		System.out.println();

		// Prompt user input
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Cost of Meal: ");
			String costString = sc.next();
			System.out.println();

			// Calculate tip amounts

			BigDecimal cost = new BigDecimal(costString);
			BigDecimal tipPercent1 = new BigDecimal(".15");
			BigDecimal tipAmount1 = cost.multiply(tipPercent1).setScale(2, RoundingMode.HALF_UP);
			BigDecimal totalAmount1 = cost.add(tipAmount1);

			BigDecimal tipPercent2 = new BigDecimal(".20");
			BigDecimal tipAmount2 = cost.multiply(tipPercent2).setScale(2, RoundingMode.HALF_UP);
			BigDecimal totalAmount2 = cost.add(tipAmount2);

			BigDecimal tipPercent3 = new BigDecimal(".25");
			BigDecimal tipAmount3 = cost.multiply(tipPercent3).setScale(2, RoundingMode.HALF_UP);
			BigDecimal totalAmount3 = cost.add(tipAmount3);

			// Display results

			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();

			String message1 = percent.format(tipPercent1) + "\n" 
					+ "Tip amount: " + currency.format(tipAmount1) + "\n"
					+ "Total amount: " + currency.format(totalAmount1) + "\n";
			System.out.println(message1);

			String message2 = percent.format(tipPercent2) + "\n" 
					+ "Tip amount: " + currency.format(tipAmount2) + "\n"
					+ "Total amount: " + currency.format(totalAmount2) + "\n";
			System.out.println(message2);

			String message3 = percent.format(tipPercent3) + "\n" 
					+ "Tip amount: " + currency.format(tipAmount3) + "\n"
					+ "Total amount: " + currency.format(totalAmount3) + "\n";
			System.out.println(message3);

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Goodbye");
		sc.close();

	}

}
