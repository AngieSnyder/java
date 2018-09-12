
public class Dice {
	private Die die1;
	private Die die2;
	/*
	 * Create two instances of die 
	 * the constructor of die will generate a 
	 * random value (rolling of the die).
	 * This is different than stated in the project instructions.
	 */
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}

	public Die getDie1() {
		return die1;
	}

	public void setDie1(Die die1) {
		this.die1 = die1;
	}

	public Die getDie2() {
		return die2;
	}

	public void setDie2(Die die2) {
		this.die2 = die2;
	}
	public int getSum() {
		return die1.getValue() + die2.getValue();
	}
	
	// This is in place of the print roll method in specs.
	
	@Override
	public String toString() {
		return "Die1: " + die1.getValue() + "\n" + 
				"Die2: "+ die2.getValue() + "\n" +
				"Total:"+getSum()+"\n" + 
				displaySpecialMessage();
	}
	// return a string that represents special case rolls...
	private String displaySpecialMessage() {
		String s = "";
		
		if (getSum() == 7) {
			s = "Craps!";
		}
		else if (getSum() == 12) {
			s = "Box Cars!";
		}
		else if (getSum() == 2) {
			s = "Snake eyes!";
			
		}
		s += "\n";
		return s;
	}
	
}
