


public class ContactListApp {
	public static void main(String args[]) {
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Welcome to the Contact List application");
			System.out.println();

			String firstName = Console.getString("Enter first name: ");

			String lastName = Console.getString("Enter last name: ");

			String email = Console.getString("Enter email: ");

			String phoneNumber = Console.getString("Enter phone number: ");

			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("---- Current Contact -----------------------");
			System.out.println("--------------------------------------------");
			System.out.println();

			System.out.println("Name: " + (firstName +" "+ lastName));
			System.out.println("Email: " + email);
			System.out.println("Phone Number: " + phoneNumber);
			System.out.println();
			
			choice = Console.getString("Continue? (y/n): ");

			System.out.println();

		}
		System.out.println("Bye!");
		System.out.println();
	}
}