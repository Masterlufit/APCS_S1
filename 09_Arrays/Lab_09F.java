import java.util.*;

public class Lab_09F {
	static int[] array;
	public static void main(String[] args) {
		array = new int[10];
		fillArray(array.length);
		printArray(getBiggest());
	}

	private static void printArray(int b) {
		System.out.println("Original Array");
		for (int a : array) {
			System.out.print(a+" ");
		}
		System.out.println("\nBiggest");
		System.out.println(b);
	}

	private static int getBiggest() {
		int b = 0;
		for (int a : array) {
			if (a>b) {
				b=a;
			}
		}
		return b;
	}

	public static void fillArray(int i) {
		Random rand = new Random();
		for (int a = 0; a < i; a++) {
			array[a] = rand.nextInt(100) + 1;
		}
	}

}
