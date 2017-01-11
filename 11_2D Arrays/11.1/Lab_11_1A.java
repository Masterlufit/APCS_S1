
import java.util.Scanner;

public class Lab_11_1A {
	static int bulletCount;
	static int clipSize = 16;
	static int shotCount;
	static String[] clipValue;

	public static void main(String[] a) {
		Scanner s = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clipValue = new String[clipSize];
		resetClip();
		while (bulletCount > 0) {
			while (shotCount >= 0) {
				System.out.println("Action:");
				String action = s.next();
				if (action.equals("R")) {
					reload();
				} else if (action.equals("S")) {
					System.out.println(shoot());
				}
				printClip();
			}
		}
		System.out.println("Out of AMMO!");
		s.close();
	}

	public static void reload() {
		if (bulletCount >= clipSize) {
			bulletCount -= clipSize;
			shotCount = clipSize;
			for (int a = 0; a < shotCount; a++) {
				clipValue[a] = "*";
			}
		} else {
			shotCount = bulletCount;
			bulletCount = 0;
			resetClip();
			for (int a = 0; a < shotCount; a++) {
				clipValue[a] = "*";
			}
		}
	}

	public static void resetClip() {	
		System.out.println("Resetting Clip..");
		bulletCount=96;
		for (int a = 0; a < clipValue.length; a++) {
			clipValue[a] = "[]";
		}
	}

	public static String shoot() {
		if (shotCount > 0) {
			clipValue[shotCount - 1] = "[]";
			shotCount--;
			return "Boom!";
		}
		return "Press R to reload!";
	}

	public static void printClip() {
		String outPut = "";
		outPut += "Bullets Stored:\t" + bulletCount + "\nClip:\t";
		for (int a = 0; a < clipSize; a++) {
			outPut += clipValue[a];
		}
		System.out.println(outPut);
	}
}