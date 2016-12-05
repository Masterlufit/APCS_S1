import java.util.*;

public class Lab_09G {
	static String[] words;

	public static void main(String[] args) {
		words = new String[5];
		fillArray();
		printArray(hasZ());
	}

	private static void printArray(String hasZ) {
		System.out.println("For the array:");
		for (String print : words) {
			System.out.print(print + " ");
		}
		System.out.println("\nOnly " + hasZ + "contain(s) the letter Z.");
	}

	private static String hasZ() {
		String z = "";
		for (String word : words) {
			if (word.contains("z")) {
				z += word + " ";
			}
		}
		return z;
	}

	private static void fillArray() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words:");
		for(int a = 0;a<5;a++){
			words[a] = kb.nextLine();
		}
		
	}

}
