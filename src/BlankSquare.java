
public class BlankSquare extends Square {

	public BlankSquare() {
		super("BLANK");
	}

	@Override
	public void action(Player p, Board b) {
		System.out.println("No action is taken at this position");
		return;

	}

}
