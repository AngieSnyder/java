import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Reservation {
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	public static final double PRICEPERNIGHT = 145.00;
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}
	
// getters and setters ARE methods. You add values to get them to do what you want.
	
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	
	public String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		String formatedDate= dtf.format(arrivalDate);
		return formatedDate;
		
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	
	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		String formatedDate= dtf.format(departureDate);
		return formatedDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	
	public int getNumberofNights() {
		return 0; // need to edit to 0
	}

	public double getTotalPrice() {
		return 0; // need to edit from 0
	}
	public String price(double unfPrice) {
		 NumberFormat currency = NumberFormat.getCurrencyInstance();
		String priceString = currency.format(unfPrice);
		return priceString;
	}
//	public String getPricePerNight() {
	//	
		//return this.PRICEPERNIGHT;
	//}

	@Override
	public String toString() {
		return "Reservation [arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + "]";
	}
	
	
	
}
