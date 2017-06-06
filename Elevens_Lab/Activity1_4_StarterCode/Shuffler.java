import java.util.Random;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call to
	 * each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 5;
	private static final int VALUE_COUNT = 15;

	/**
	 * Tests shuffling methods.
	 * 
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
		int[] values1 = { 0, 1, 2, 3 };
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
		int[] values2 = { 0, 1, 2, 3 };
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Apply a "perfect shuffle" to the argument. The perfect shuffle algorithm
	 * splits the deck in half, then interleaves the cards in one half with the
	 * cards in the other.
	 * 
	 * @param values
	 *            is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		// Create 2 arrays for each half
		int[] first_half = new int[VALUE_COUNT / 2];
		int[] second_half = new int[VALUE_COUNT - VALUE_COUNT / 2];

		// Split the deck in half and assign to each half
		for (int i = 0; i < VALUE_COUNT / 2; i++) {
			first_half[i] = values[i];
		}
		for (int i = 0; i < VALUE_COUNT - VALUE_COUNT / 2; i++) {
			second_half[i] = values[i + VALUE_COUNT / 2];
		}

		// Set original deck with perfect shuffle from 2 half decks
		for (int i = 0; i < VALUE_COUNT / 2; i++) {
			values[2 * i] = second_half[i];
			values[2 * i + 1] = first_half[i];
		}

		if (VALUE_COUNT % 2 != 0) {
			values[VALUE_COUNT - 1] = second_half[VALUE_COUNT - VALUE_COUNT / 2];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument. The selection
	 * shuffle algorithm conceptually maintains two sequences of cards: the
	 * selected cards (initially empty) and the not-yet-selected cards
	 * (initially the entire deck). It repeatedly does the following until all
	 * cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards. An efficient version of this
	 * algorithm makes use of arrays to avoid searching for an as-yet-unselected
	 * card.
	 * 
	 * @param values
	 *            is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		for (int a = VALUE_COUNT - 1; a >= 0; a--) {
			Random r = new Random();
			int rand = (int) (r.nextDouble() * a);
			int storage = values[rand];
			values[rand] = values[a];
			values[a] = storage;
		}
	}
}
