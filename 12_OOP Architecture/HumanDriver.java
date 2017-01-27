import java.util.Scanner;

public class HumanDriver {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Print("My Info..");
		Human h = new Human("black", "black", "yellow");
		Print("Hair: " + h.getHair());
		Print("Eyes: " + h.getEye());
		Print("Skin: " + h.getSkin());

		Print("Enter the HAIR for the person:");
		String hair = s.nextLine();
		Print("Enter the EYES for the person:");
		String eyes = s.nextLine();
		Print("Enter the SKIN for the person:");
		String skin = s.nextLine();

		Print("Friend's Info..");
		h.setHES(hair, eyes, skin);
		Print("Hair: " + h.getHair());
		Print("Eyes: " + h.getEye());
		Print("Skin: " + h.getSkin());

		s.close();
	}

	public static void Print(String msg) {
		System.out.println(msg);
	}
}
