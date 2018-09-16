
public abstract class Animal implements Countable{
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Animal [count=" + count + "]";
	}

}
