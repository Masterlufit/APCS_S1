package lab_2;

import java.util.Scanner;

public class DistanceRunner {
	public static void main(String[] args) {
		try {

			Scanner input = new Scanner(System.in);
			print("Enter the X-COORDS for the FIRST point:");
			int x1 = input.nextInt();
			print("Enter the Y-COORDS for the FIRST point:");
			int y1 = input.nextInt();
			print("Enter the X-COORDS for the SECOND point:");
			int x2 = input.nextInt();
			print("Enter the Y-COORDS for the SECOND point:");
			int y2 = input.nextInt();
			Distance get = new Distance(x1, x2, y1, y2);
			print("Distance: " + get.getDis());
			print("Enter the X-COORDS for the FIRST point:");
			x1 = input.nextInt();
			print("Enter the Y-COORDS for the FIRST point:");
			y1 = input.nextInt();
			print("Enter the X-COORDS for the SECOND point:");
			x2 = input.nextInt();
			print("Enter the Y-COORDS for the SECOND point:");
			y2 = input.nextInt();
			get = new Distance(x1, x2, y1, y2);
			print("Distance: " + get.getDis());
			input.close();
		} catch (Exception e) {
			print("Did you enter the values correctly?");
		}
	}

	public static void print(String msg) {
		System.out.println(msg);
	}
}
