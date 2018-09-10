import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		// Welcome Message
		System.out.println();
		System.out.println("Welcome to the Interest Calculator");
		String choice = "y";
		System.out.println();
		
		// prompt user input
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter loan amount: ");
			double loanAmount = sc.nextDouble();
			
			System.out.print("Enter interest rate: ");
			double interestRate = sc.nextDouble();
			System.out.println();
			
		// calculate interest
			
			BigDecimal decimalLoanAmount = new BigDecimal(loanAmount);
			decimalLoanAmount = decimalLoanAmount.setScale(2, RoundingMode.HALF_UP);
			//BigDecimal decimalInterestRate = new BigDecimal(interestRate);
			//decimalInterestRate = decimalInterestRate.setScale(3, RoundingMode.HALF_UP);
			double interestAmount = loanAmount * interestRate;
			//System.out.println(decimalInterestRate);
			
		// display results including loan amount and interest
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
			System.out.println("Loan Amount:    " + currency.format(decimalLoanAmount));
			System.out.println("Interest Rate:  " + percent.format(interestRate));
			System.out.println("Interest:       " + currency.format(interestAmount));
		
		// promt user to continue
			
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Goodbye");
		sc.close();		

	}

}
