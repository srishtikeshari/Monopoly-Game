import java.util.Random;

public class Board {
	
	Square squares[] = new Square[36];
	Player p1 = new Player("Player 1", 1);
	Player p2 = new Player("Player 2", 2);
	Dice dice = new Dice();
	
	Board() {
		initializeBoard();
	}
	
	public void initializeBoard() {
		
		Random r =new Random();
		for(int i=0;i<36;i++) {
			if(i==0 || i==9 || i==18 || i==27)
				squares[i] = new JailSquare();
			else if(i==4 || i==12 || i==16 || i==23 || i==29 || i==33) 
				squares[i] = new BlankSquare();
			else {
				int temp = 50 + r.nextInt(50);
				squares[i] = new PropertySquare(temp, (int)(temp * 0.4) );
			}
		}
	}
	
	public void movePlayer(Player p) {
		int newPos = (p.getPosition() + p.rollDice(dice)) % 36;
		p.setPosition(newPos);
		System.out.println(p.getName() + " is now at position - " + newPos + " --->" + squares[newPos].getName());
		System.out.println("Current amount you possess -> "+p.getMoney().getAmount());
		squares[newPos].action(p, this);
		System.out.println("Now the amount you possess -> "+p.getMoney().getAmount());
		if(p.getMoney().getAmount() <= 0) {
			System.out.println("You are now in DEBTS, YOU LOST!!");
		}
		else {
			p.setTotalTurn(p.getTotalTurn() + 1);
		}
	}
}
