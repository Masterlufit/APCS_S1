import java.util.*;

public class Honda implements Location{
	private double[] location;

	public Honda(double[] loc) {
		this.location = loc;
	}

	public int getID() {
		Random r = new Random();
		return r.nextInt(1000000);
	}

	public void move(double x, double y) {
		location = new double[] {x,y};
	}

	public double[] getLoc() {
		return location;
	}
}