
public class JailSquare extends Square {

	public JailSquare() {
		super("JAIL");
	}

	@Override
	public void action(Player p, Board b) {
		System.out.println("200 amount will be deducted here at JAIL");
		p.getMoney().deductMoney(200);
	}

}
