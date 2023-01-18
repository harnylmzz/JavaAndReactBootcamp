package gameDemo.entitiy;

public class Game {

	private int id;
	private String name;

	public Game() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Game(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
