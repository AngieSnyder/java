import java.util.Scanner;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser!");
		
		System.out.println("Create a new Stuffy...");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter stuffy name:");
		String name = sc.next();
		
		System.out.print("Enter stuffy type (Bear, Monkey, ect):");
		String type = sc.next();
		
		System.out.print("Enter stuffy color:");
		String color = sc.next();
		
		Stuffy myStuffy = new Stuffy(name, type, color);
		
		System.out.println("New Stuffy:"+myStuffy);
		
		sc.close();
		System.out.println("Bye!");

	}

}
