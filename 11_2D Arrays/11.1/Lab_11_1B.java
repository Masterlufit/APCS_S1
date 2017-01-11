import java.util.*;

public class Lab_11_1B {
	static int healthCount;
	static int healthLoad = 6;
	static String[] Health;

	public static void main(String[] a) {
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		Health = new String[healthLoad];

		while (!turn.equals("Q") && healthCount > 0) {
			System.out.println("Your turn! Hit enter when ready:");
			turn = s.next();
			if (turn.equals("Q")) {
				System.out.println("Quitted the Game");
				s.close();
				return;
			}
			damage = rand.nextInt(2) + 1;
			amount = rand.nextInt(6) + 1;
			System.out.println(takeDmg(damage, amount));
			printClip();
		}

		System.out.println("You Died!");
		s.close();
	}

	public static String takeDmg(int dmg, int amount) {
		if (dmg == 1) {
			healthCount -= amount;
			return "Taking " + amount + " damage!";
		} else {
			if (healthCount + amount < healthLoad) {
				healthCount += amount;
				return "Healed " + amount + " Health!";
			} else {
				healthCount = healthLoad;
				return "Powered up " + amount + " Health!";
			}
		}
	}

	public static void printClip() {
		String OP = "Health:\t";
		for (int a = 0; a < healthLoad; a++) {
			if (a < healthCount) {
				Health[a] = "@";
			} else {
				Health[a] = "[]";
			}
			OP += Health[a];
		}
		System.out.println(OP);
	}
}