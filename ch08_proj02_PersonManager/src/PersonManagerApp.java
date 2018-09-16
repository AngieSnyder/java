public class PersonManagerApp {

	public static void main(String[] args) {
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			// Welcome message
			System.out.println("Welcome to the Person Manager");
			System.out.println();

			// request person information
			String personType = Console.getString("Create customer or employee? (c/e): ");
			
			
			if (Person.equalsIgnoreCase("c")) {
				Person p = Console.getString(Customer);

			}

		}

	}
}