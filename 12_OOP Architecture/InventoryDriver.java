import java.util.Scanner;

public class InventoryDriver {
	static boolean loop = true;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Inventory item1;
		Print("Do you want to specify the Category and the Price? y/n");
		boolean res = false;
		while (true) {
			String next = s.next();
			if (next.equals("y") || next.equals("n")) {
				if (next.equals("y"))
					res = true;
				else
					res = false;
				break;
			} else {
				Print("Invalid Input");
				Print("Do you want to specify the Category and the Price? y/n");
			}
		}
		s.nextLine();
		if (res) {
			Print("Enter the Manufacturer, Item Name, Category and Price:");
			item1 = new Inventory(s.nextLine(), s.nextLine(), s.nextLine(), Integer.parseInt(s.nextLine()));
		} else {
			Print("Enter the Manufacturer and Item Name:");
			item1 = new Inventory(s.nextLine(), s.nextLine());
		}
		Print(item1.toString());
		s.close();
	}

	public static void Print(String msg) {
		System.out.println(msg);
	}
}
