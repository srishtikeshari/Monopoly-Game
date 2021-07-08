
public class MonopolyDriver {
	
	Board board = new Board();
	int turn = 1;
	
	public static void main(String[] args) {
		
		System.out.println("\tMONOPOLY GAME BETWEEN 2 PLAYERS\n\n Game starting****\n(Both Players start at 4th Position On the Board)\n-----------------------------------------------");
		MonopolyDriver obj = new MonopolyDriver();
		obj.start();
	}

	private void start() {
		
		for(int i=1; i<210; i++) {
			
			if(board.p1.getMoney().getAmount()<=0 || board.p2.getMoney().getAmount()<=0)
				break;
		
			System.out.println("\n\n=========\nROUND "+i+"\n=========");
			
			System.out.println("\n***Player 1***");
			board.movePlayer(board.p1);
			
			if(board.p1.getMoney().getAmount()<=0 || board.p2.getMoney().getAmount()<=0)
				break;
			
			System.out.println("\n***Player 2***");
			board.movePlayer(board.p2);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		if(board.p1.getMoney().getAmount()<=0)
			System.out.println("PLAYER 2 WON!!! AS PLAYER 1 IS IN DEBTS");
		else if(board.p2.getMoney().getAmount()<=0)
			System.out.println("PLAYER 1 WON!!! AS PLAYER 2 IS IN DEBTS");
		else if(board.p1.getMoney().getAmount() > board.p2.getMoney().getAmount())
			System.out.println("PLAYER 1 WON!!! AS HE HAS MORE AMOUNT AT THE END");
		else if(board.p1.getMoney().getAmount() < board.p2.getMoney().getAmount())
			System.out.println("PLAYER 2 WON!!! AS HE HAS MORE AMOUNT AT THE END");
		
		return;
		
	}

}
