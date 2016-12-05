import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab_10B {
	public static void main(String[] args) {
		Scanner SInput = new Scanner(System.in);
		System.out.println("Enter an equation: use SPACE between inputs");
		String expression = SInput.nextLine();

		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));

		doEquation(equation);

		System.out.println(equation);

	}

	public static void doEquation(ArrayList<String> equation) {
		int i = 0;
		while (i < equation.size()) {
			if (i < equation.size() && equation.get(i).equals("+")) {
				equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) + (Integer.parseInt(equation.get(i + 1)))));
				equation.remove(i - 1);
				equation.remove(i);
			} else if (i < equation.size() && equation.get(i).equals("-")) {
				equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) + (Integer.parseInt(equation.get(i + 1)))));
				equation.remove(i - 1);
				equation.remove(i);
			} else if (i < equation.size() && equation.get(i).equals("*")) {
				equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) * (Integer.parseInt(equation.get(i + 1)))));
				equation.remove(i - 1);
				equation.remove(i);
			} else if (i < equation.size() && equation.get(i).equals("/")) {
				equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) / (Integer.parseInt(equation.get(i + 1)))));
				equation.remove(i - 1);
				equation.remove(i);
			} else {
				i++;
			}
		}
	}
}