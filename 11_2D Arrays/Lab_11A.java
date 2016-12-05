import java.util.*;

public class Lab_11A {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][] nums = new int[4][4];

		for (int a = 0; a < nums.length; a++) {
			for (int b = 0; b < nums[a].length; b++) {
				int random = rand.nextInt(90) + 10;
				nums[a][b] = random;
			}
		}
		for (int a = 0; a < nums.length; a++) {
			for (int b = 0; b < nums[a].length; b++) {
				System.out.print(nums[a][b] + " ");
			}
			System.out.println("");
		}
	}
}
