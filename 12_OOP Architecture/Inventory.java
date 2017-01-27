import java.util.Random;

public class Inventory {
	static String m, n, c;
	static long id;
	int p;
	static Random r = new Random();

	public Inventory(String manu, String name) {
		n = name;
		m = manu;
		c = "DEFAULT";
		p = 0;
		id = r.nextInt(100000000) + 1;
	}

	public Inventory(String manu, String name, String cate, int price) {
		n = name;
		m = manu;
		c = cate;
		p = price;
		id = r.nextInt(100000000) + 1;
	}

	public String toString() {
		return "Item Info:\n" + "Manufacturer: " + m + "\nName: " + n + "\nCategory: " + c + "\nID: " + id
				+ "\nPrice: $" + p;
	}
}
