import java.util.*;

public class Lab_11C {
	public static void main(String[] args) {
		Random rand = new Random();
		String[][] XandOs = new String[4][4];
		for (int a = 0; a < XandOs.length; a++) {
			for (int b = 0; b < XandOs[a].length; b++) {
				int random = rand.nextInt(2);
				if (random == 1) {
					XandOs[a][b] = "O";
				}
				if (random == 0) {
					XandOs[a][b] = "X";
				}
			}
		}
		for (int a = 0; a < XandOs.length; a++) {
			for (int b = 0; b < XandOs[a].length; b++) {
				System.out.print(XandOs[a][b] + "\t");
			}
			System.out.println("");
		}
	}
}
