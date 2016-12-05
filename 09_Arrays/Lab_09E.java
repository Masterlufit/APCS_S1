import java.util.*;

public class Lab_09E {
	static int[] array;
	public static void main(String[] args) {
		array = new int[10];
		fillArray(array.length);
		printArray(getOdds());
	}

	private static void printArray(String odds) {
		System.out.println("Original Array");
		for (int a : array) {
			System.out.print(a+" ");
		}
		System.out.println("\nOdds");
		System.out.println(odds);
	}

	private static String getOdds() {
		String odds = "";
		for (int a : array) {
			if (a % 2 == 1) {
				odds += a + " ";
			}
		}
		return odds;
	}

	public static void fillArray(int i) {
		Random rand = new Random();
		for (int a = 0; a < i; a++) {
			array[a] = rand.nextInt(100) + 1;
		}
	}

}
