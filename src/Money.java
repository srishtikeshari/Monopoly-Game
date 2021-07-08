
public class Money {
	private int amount = 1500;

	public int getAmount() {
		return amount;
	}
	
	public void addMoney(int x) {
		amount += x;
	}
	
	public void deductMoney(int x) {
		amount -= x;
	}
	
}
