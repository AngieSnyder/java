import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter degrees in Fahrenheit:");
			double Fahrenheit = sc.nextDouble();
			double Celsius = (Fahrenheit - 32) * 5 / 9;

			NumberFormat number = NumberFormat.getInstance();
			number.setMaximumFractionDigits(1);
			System.out.println("Degrees in Celsius: " + number.format(Celsius));

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Goodbye");
	}

}
