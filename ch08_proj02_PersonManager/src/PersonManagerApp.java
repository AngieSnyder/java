public class PersonManagerApp {

	public static void main(String[] args) {
		
		// Welcome message
		System.out.println("Welcome to the Person Manager");
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String typeOfPerson = Console.getString("Create customer or employee? (c/e): ", "c", "e");
			System.out.println();
			if (typeOfPerson.equalsIgnoreCase("c")) {
				String firstName=Console.getString("First Name: ");
				String lastName=Console.getString("Last Name: ");
				String customerNumber=Console.getString("Customer Number: "); 
				Customer c = new Customer(firstName, lastName, customerNumber);
				System.out.println();
				System.out.println("You entered a new Customer: " + "\n");
				System.out.println(c.toString());
			}
			if (typeOfPerson.equalsIgnoreCase("e")) {
				String firstName=Console.getString("First Name: ");
				String lastName=Console.getString("Last Name: ");
				String ssn=Console.getString("SSN: "); 
				Employee e = new Employee(firstName, lastName, ssn);
				System.out.println();
				System.out.println("You entered a new Employee: " + "\n");
				System.out.println();
				System.out.println(e.toString());
			}
			choice = Console.getString("Continue? (y/n): ");
			System.out.println();
		}
		System.out.println("Bye");
	}
}