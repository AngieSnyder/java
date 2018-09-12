
public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			int grade = Console.getInt("Enter numerical grade: ", -1, 101);
			Grade g = new Grade(grade);
			
			System.out.println("Letter grade: "+g.getLetter());
			System.out.println();
			
			choice = Console.getString("Continue? (y/n): ", "y","n");
		}
		
		System.out.println("Bye!");
	}

}
