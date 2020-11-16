
public class MonopolyGame{

	public static void main(String args[]) {

		Token wheelbarrow = new Token("wheelbarrow","red" );
		wheelbarrow.updatePosition(5);
		System.out.println(wheelbarrow);

		Player p1 = new Player("farisah", wheelbarrow);
		System.out.println(p1);


		Token hat = new Token("hat", "green");
		PropertyOwner po1 = new PropertyOwner("farisah", hat);
		po1.buyProperty("Tesco Parit Raja");
		System.out.println(po1);


		
		Token car = new Token( ); 
	}
}