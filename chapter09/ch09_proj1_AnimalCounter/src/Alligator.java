
public class Alligator extends Animal {

	public Alligator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void incrementCount() {
		setCount(getCount() + 1);

	}

	@Override
	public void resetCount() {
		setCount(0);

	}

	@Override
	public int getCount() {
		return super.getCount();
	}

	@Override
	public String getCountString() {
		return getCount() + " alligator";
	}

}
