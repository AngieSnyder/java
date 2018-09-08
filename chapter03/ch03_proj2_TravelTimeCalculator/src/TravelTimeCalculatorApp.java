import java.text.NumberFormat;
import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Welcome to the Travel Time Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.println();

		// prompt user input
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles: ");
			double miles = sc.nextDouble();
			System.out.print("Enter miles per hour: ");
			double mph = sc.nextDouble();
			System.out.println();

			// calculate time
			int hours = (int) (miles / mph);
			int minutes = (int) (miles % mph);

			// print results
			String message = "Estimated travel time" + "\n" 
				+	"_______________________" + "\n";
			System.out.println("Hours: " + hours);
			System.out.println("Minutes:  " + minutes);
			System.out.println();
			
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Goodbye");
		sc.close();

	}

}


//output time
//			NumberFormat number = NumberFormat.getNumberInstance();
//			number.setMaximumFractionDigits(0);
//
//			String message = "Estimated travel time" + "\n" + "-----------------------" + "\n" + "Hours: "
//					+ number.format(hours) + "\n" + "Minutes: " + number.format(minutes) + "\n";
//			System.out.println(message);