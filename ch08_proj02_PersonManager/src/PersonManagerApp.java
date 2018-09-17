public class PersonManagerApp {

	public static void main(String[] args) {
		
		// Welcome message
		System.out.println("Welcome to the Person Manager");
		System.out.println();
		
		Console.getString("Create customer or employee? (c/e): ");		
		String command = "";
		while (!command.equalsIgnoreCase(" ")) {
		}
		
		Console.getString("First Name: ");
		Console.getString("Last Name: ");
		Console.getString("Customer Number: ");
		Console.getString("SSN: ");
	}
}