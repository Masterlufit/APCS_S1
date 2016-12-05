import java.util.*;

public class Lab_10A {
	static ArrayList<Integer> nums;

	public static void main(String[] args) {
		// 2,6,8,9,10,12,13,15,17,24,55,66,78,77,79
		Integer[] numbers = { 2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79 };
		nums = new ArrayList<>(Arrays.asList(numbers));
		removeComp();
		System.out.println(nums);
	}

	public static int gFactor(int a) {
		for (int loop = 2; loop < a; loop++) {
			if (a % loop == 0) {
				return 1;
			}
		}
		return 0;
	}

	public static void removeComp() {
		for (int i = 0; i < nums.size(); i++) {
			if (gFactor(nums.get(i)) == 0)
				nums.remove(i);
		}
	}
}