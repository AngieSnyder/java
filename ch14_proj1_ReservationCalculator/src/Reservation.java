import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

import javax.swing.text.NumberFormatter;

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
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String formattedDate= dtf.format(arrivalDate);
		return formattedDate;
		
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	
	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String formattedDate= dtf.format(departureDate);
		return formattedDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	
	public int getNumberOfNights() {
		long numOfNights = ChronoUnit.DAYS.between(arrivalDate, departureDate);
		return (int) numOfNights;
	}

	public double getTotalPrice() {
		double totalPrice = (PRICEPERNIGHT * getNumberOfNights());
		return totalPrice;
	}
	public String getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String ppNight = currency.format(PRICEPERNIGHT);
		return ppNight;
	}
	public String getTotalPriceFormatted() {
		 NumberFormat currency = NumberFormat.getCurrencyInstance();
		String totalPriceFormatted = currency.format(getTotalPrice());
		return totalPriceFormatted;
	}

	@Override
	public String toString() {
		return "Reservation [arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + "]";
	}
	
	
	
}
