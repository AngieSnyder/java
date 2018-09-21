import java.time.LocalDate;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");
		System.out.println();

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int arrivalMonth = Console.getInt("Enter the arrival month (1-12): ");
			int arrivalDay = Console.getInt("Enter the arrival day (1-31): ");
			int arrivalYear = Console.getInt("Enter the arrival year: ");
			System.out.println();
			int departureMonth = Console.getInt("Enter the departure month (1-12): ");
			int departureDay = Console.getInt("Enter the departure day (1-31): ");
			int departureYear = Console.getInt("Enter the departure year: ");
			System.out.println();

			LocalDate arriveDate = LocalDate.of(arrivalYear, arrivalMonth, arrivalDay);
			LocalDate departDate = LocalDate.of(departureYear, departureMonth, departureDay);

			Reservation reservation = new Reservation(arriveDate, departDate);

			System.out.println("Arrival Date: " + reservation.getArrivalDateFormatted());
			System.out.println("Departure Date: " + reservation.getDepartureDateFormatted());
			System.out.println("Price: " + reservation.getPricePerNightFormatted());
			System.out.println("Total Price: " + reservation.getTotalPriceFormatted() + " for " 
											+ reservation.getNumberOfNights() + " nights");
			
			System.out.println();
			choice = Console.getString("Continue? (y/n): ");
			System.out.println();

		}

		System.out.println("Bye!");

	}

}
