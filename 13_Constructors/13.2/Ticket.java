import java.util.Random;

public abstract class Ticket {
	private int serialNo;

	public Ticket() {
		Random r = new Random();
		serialNo = r.nextInt(10000000);
	}

	public int getSerial() {
		return serialNo;
	}

	public abstract int getPrice();

	public String toString() {
		return "Serial: " + serialNo + "\nPrice: $" + getPrice();
	}
}