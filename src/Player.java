
public class Player {
	private String name;
	private int id;
	private int totalTurn = 0;
	private int position = 4;
	private Money money = new Money();
	
	public Player(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getTotalTurn() {
		return totalTurn;
	}

	public void setTotalTurn(int totalTurn) {
		this.totalTurn = totalTurn;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Money getMoney() {
		return money;
	}
	
	public int rollDice(Dice d) {
		return d.roll();
	}
	
}
