import java.util.Scanner;

public class StuffDriver {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Print("Enter your FIRST NAME:");
		String fni = s.nextLine();
		Print("Enter your LAST NAME:");
		String lni = s.nextLine();

		Print("Do you want a public Avatar?");
		String q = s.nextLine();
		if (q.equalsIgnoreCase("yes")) {
			Print("Enter your AVATAR:");
			String avi = s.nextLine();
			Stuff st = new Stuff(fni, lni, avi);
			Print(st.toString());
		} else if (q.equalsIgnoreCase("no")) {
			Stuff st = new Stuff(fni, lni);
			Print(st.toString());
		} else {
			Print("Invalid Input");
			s.close();
			return;
		}

		s.close();
	}

	public static void Print(String msg) {
		System.out.println(msg);
	}
}
