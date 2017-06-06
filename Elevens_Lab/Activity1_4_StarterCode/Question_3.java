import java.util.Arrays;
import java.util.Random;

public class Question_3 {
	public static String flip() {
		Random r = new Random();
		int rand = r.nextInt(3);
		if (rand < 2)
			return "heads";
		else
			return "tails";
	}

	public static boolean arePermutations(int[] one, int[] two) {
		if (one.length != two.length)
			return false;

		Arrays.sort(one);
		Arrays.sort(two);
		for (int a = 0; a < one.length; a++) {
			if (one[a] != two[a])
				return false;
		}
		return true;
	}
	
}
