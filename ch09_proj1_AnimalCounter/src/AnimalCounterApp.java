
public class AnimalCounterApp {

	public static void main(String[] args) {
		System.out.println("Counting alligators...");
		System.out.println();

		Alligator a = new Alligator();
		count(a, 3);
		System.out.println();

		System.out.println("Counting sheep...");
		System.out.println();
		Sheep s1 = new Sheep("Blackie");
		count(s1, 2);
		Sheep s2 = null;

		try {
			s2 = (Sheep) s1.clone();
			s2.setName("Dolly");
			count(s2, 2);
			count(s1, 1);

		} catch (CloneNotSupportedException ex) {
			System.out.println("error");
		}
	}

	public static void count(Countable c, int maxCount) {

		while (maxCount > 0) {
			maxCount--;
			c.incrementCount();
			System.out.println(c.getCountString());
		}
		c.resetCount();
		System.out.println();
	}

}
