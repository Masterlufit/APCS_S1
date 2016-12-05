import java.util.*;

public class Lab_11D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int[][] nums = new int[4][4];

		for (int a = 0; a < nums.length; a++) {
			for (int b = 0; b < nums[a].length; b++) {
				int random = rand.nextInt(100) + 1;
				nums[a][b] = random;
				System.out.print(nums[a][b] + "\t");
			}
			System.out.println("");
		}
		System.out.println("Enter a number:");
		int divisor = input.nextInt();
		if (divisor == 0) {
			System.out.println("Error: Cannot divide by 0!");
			return;
		}
		int count = 0;
		for (int a = 0; a < nums.length; a++) {
			for (int b = 0; b < nums[a].length; b++) {
				if (nums[a][b] % divisor == 0) {
					count++;
				}
			}
		}
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the Array.");
	}
}
