import java.util.*;
public class Car implements Location {
	public double[] location;
	private Random r = new Random();
	private final int id = r.nextInt(1000000);

	public Car() {
		location = new double[2];
	}

	public int getID() {
		return id;
	}

	public void move(double x, double y) {
		location = new double[] { x, y };
	}

	public double[] getLoc() {
		return location;
	}
}