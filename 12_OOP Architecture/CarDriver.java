import java.util.Scanner;

public class CarDriver {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Print("Enter the PAINT for the car:");
		String paint = s.nextLine();
		Print("Enter the INTERIOR for the car:");
		String inte = s.nextLine();
		Print("Enter the ENGINE for the car:");
		String eng = s.nextLine();
		Print("Enter the TIRES for the car:");
		String tire = s.nextLine();

		Print("Your vehicle is ready..");
		Car c = new Car(paint, inte, eng, tire);
		Print("Paint: " + c.getPaint());
		Print("Interior: " + c.getInterior());
		Print("Engine: " + c.getEngine());
		Print("Tires: " + c.getTire());

		s.close();
	}

	public static void Print(String msg) {
		System.out.println(msg);
	}
}
