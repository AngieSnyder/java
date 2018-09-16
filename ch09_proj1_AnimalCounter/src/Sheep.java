
public class Sheep extends Animal implements Cloneable {
	private String name;
	
	
	public Sheep(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void incrementCount() {
		setCount(getCount()+1);

	}

	@Override
	public void resetCount() {
		setCount (0);

	}

	@Override
	public String getCountString() {
		return getCount() + " "+name;
	}
	@Override
	public Object clone	() throws CloneNotSupportedException {
		return super.clone();
	}

}
