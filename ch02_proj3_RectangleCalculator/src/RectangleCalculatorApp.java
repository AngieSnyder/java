import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		// Welcome Statement
		System.out.println();
		System.out.println("Welcome to the Area and Perimeter Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.println();

		// prompt user input
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter length: ");
			double length = sc.nextDouble();
			System.out.print("Enter width:  ");
			double width = sc.nextDouble();

			// calculate the area and perimeter
			double area = (width * length);
			double perimeter = (2 * width + 2 * length);

			// display results
			System.out.println("Area:         " + area);
			System.out.println("Perimeter:    " + perimeter);
			System.out.println();

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		// goodbye message
		System.out.println("Goodbye");
		sc.close();

	}
}
