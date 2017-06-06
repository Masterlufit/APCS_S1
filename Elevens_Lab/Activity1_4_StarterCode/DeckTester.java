/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {
		Deck d = new Deck(new String[] { "A", "B", "C", "D" }, new String[] { "Suit A", "Suit B", "Suit C", "Suit D" },
				new int[] { 1, 2, 3, 4 });

		System.out.println(d);
		d.deal();
		System.out.println(d);
		d.deal();
		System.out.println(d);
		d.deal();
		System.out.println(d);
		d.deal();
		System.out.println(d);
	}
}
