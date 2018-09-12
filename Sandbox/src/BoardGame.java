
public class BoardGame extends Toy {
	private String name;
	private int peices;
	
	public BoardGame(int id, String code, double price, String name, int peices) {
		super(id, code, price);
		this.name = name;
		this.peices = peices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPeices() {
		return peices;
	}

	public void setPeices(int peices) {
		this.peices = peices;
	}

	@Override
	public String toString() {
		return super.toString() + "BoardGame [name=" + name + ", peices=" + peices + "]";
	}
	
}
