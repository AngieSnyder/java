import java.util.Scanner;

public class NameParserApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a name: ");
		String name = sc.nextLine();
		name = name.trim();

		int index1 = name.indexOf(" ");
		if (index1 == -1) {
			System.out.println("Name not in valid format.");
		} else {
			int index2 = name.indexOf(" ", index1 + 1);
			if (index2 == -1) {
				String[] nameParts = name.split(" ");
				String firstName = nameParts[0];
				String lastName = nameParts[1];
				System.out.println();
				System.out.println("First Name: " + firstName);
				System.out.println("Last Name: " + lastName);
			} else {
				int index3 = name.indexOf(" ", index2 + 1);
				if (index3 == -1) {
					String[] nameParts = name.split(" ");
					String firstName = nameParts[0];
					String midName = nameParts[1];
					String lastName = nameParts[2];
					System.out.println();

					System.out.println("First Name: " + firstName);
					System.out.println("Middle Name: " + midName);
					System.out.println("Last Name: " + lastName);
				}
				else {
					System.out.println("Name not in valid format.");
				}
			}
		}
	}
}
