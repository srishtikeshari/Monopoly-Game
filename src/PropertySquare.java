import java.util.Scanner;

public class PropertySquare extends Square {
	private int propertyValue;
	private int propertyRent;
	private int ownerID = 0;
	
	public PropertySquare(int v, int r) {
		super("PROPERTY");
		this.propertyValue = v;
		this.propertyRent = r;
	}
	
	public int getOwner() {
		return ownerID;
	}

	public void setOwner(int owner) {
		this.ownerID = owner;
	}

	public int getPropertyValue() {
		return propertyValue;
	}

	public int getPropertyRent() {
		return propertyRent;
	}

	@Override
	public void action(Player p, Board b) {
		if(ownerID == 0) {
			if(p.getMoney().getAmount()<propertyValue) {
				System.out.println("NO ONE OWNS THIS PROPERTY, but you cannot buy it as you are low on money");
				return;
			}
			System.out.println("NO ONE OWNS THIS PROPERTY, do you want to buy it @ " + propertyValue + " -- Y/N" );
//			Scanner sc = new Scanner(System.in);
//			String ans = sc.nextLine();
//			sc.close();
			//
			String ans = "y";
			if(ans.equalsIgnoreCase("y")) {
				ownerID = p.getId();
				p.getMoney().deductMoney(propertyValue);
				System.out.println("Successfully Bought!!!!!!");
			}
			else if(ans.equalsIgnoreCase("n")) {
				System.out.println("You don't want to buy.");
				return;
			}
		}
		
		else if(ownerID == 1 && p.getId() == 1) {
			System.out.println("YOU OWN THIS PROPERTY, do you want to sell it @ " + propertyValue + " -- Y/N" );
//			Scanner sc = new Scanner(System.in);
//			String ans = sc.nextLine();
//			sc.close();
			//
			String ans = "n";
			if(ans.equalsIgnoreCase("y")) {
				ownerID = 0;
				p.getMoney().addMoney(propertyValue);
				System.out.println("SOLD!!!!!");
			}
			else if(ans.equalsIgnoreCase("n"))
				return;
		}
			
		else if(ownerID == 2 && p.getId() == 2) {
			System.out.println("YOU OWN THIS PROPERTY, do you want to sell it @ " + propertyValue + " -- Y/N" );
//			Scanner sc = new Scanner(System.in);
//			String ans = sc.nextLine();
//			sc.close();
			//
			String ans = "n";
			if(ans.equalsIgnoreCase("y")) {
				ownerID = 0;
				p.getMoney().addMoney(propertyValue);
				System.out.println("SOLD!!!!!");
			}
			else if(ans.equalsIgnoreCase("n"))
				return;
		}
		
		else if(ownerID == 1 && p.getId() == 2) {
			System.out.println("Player 1 OWNS THIS PROPERTY, you have to pay rent @ " + propertyRent);
			p.getMoney().deductMoney(propertyRent);
			b.p1.getMoney().addMoney(propertyRent);
		}
		
		else if(ownerID == 2 && p.getId() == 1) {
			System.out.println("Player 2 OWNS THIS PROPERTY, you have to pay rent @ " + propertyRent);
			p.getMoney().deductMoney(propertyRent);
			b.p2.getMoney().addMoney(propertyRent);
			
		}
	}

}
