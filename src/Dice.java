import java.util.Random;

public class Dice {
	
	public int roll() {
		Random rand = new Random();
		int value = 1+rand.nextInt(12);
		System.out.println("Rolled two die and sum of value is -> "+value);
		return value;
	}
}
