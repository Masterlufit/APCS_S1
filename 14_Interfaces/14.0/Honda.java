import java.util.*;

public class Honda implements Location{
	private double[] location;
	private Random r =new Random();
	private final int id = r.nextInt(1000000);
	
	public Honda(double[] loc) {
		this.location = loc;
	}

	public int getID() {
		return id;
	}

	public void move(double x, double y) {
		location = new double[] {x,y};
	}

	public double[] getLoc() {
		return location;
	}
}