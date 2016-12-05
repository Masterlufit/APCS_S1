import java.util.*;

public class Lab_11B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] words = new String[4][4];

		for (int a = 0; a < words.length; a++) {
			for (int b = 0; b < words[a].length; b++) {
				System.out.println("Enter a word:");
				String in = input.nextLine();
				words[a][b] = in;
			}
		}
		for (int a = 0; a < words.length; a++) {
			for (int b = 0; b < words[a].length; b++) {
				System.out.print(words[a][b] + " ");
			}
			System.out.println("");
		}
	}
}
