import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		// display form name
		System.out.println("Student Registration Form");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		// get the input from the user
		System.out.print("Enter first name: ");
		String firstName = sc.next();
		System.out.print("Enter last name: ");
		String lastName = sc.next();
		System.out.print("Enter year of birth: ");
		int yearOfBirth = sc.nextInt();

		System.out.println();

		// display results

		String name = firstName + " ";
		name += lastName;
		
		String message = "Welcome "+ name;
		message = message + "!";

		String password = firstName + "*";
		password += yearOfBirth;

		System.out.println(message);
		System.out.println("Your registration is complete");
		System.out.println("Your temporary password is: " + password);

		//
		sc.close();
	}

}
