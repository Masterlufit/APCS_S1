import java.util.*;

public class GMC implements Location{
	private double loc_x, loc_y;
	private Random r =new Random();
	private final int id = r.nextInt(1000000);
	
	public GMC(double x, double y) {
		this.loc_x = x;
		this.loc_y = y;
	}

	public int getID() {
		return id;
	}

	public void move(double x, double y) {
		this.loc_x = x;
		this.loc_y = y;
	}

	public double[] getLoc() {
		return new double[] { this.loc_x, this.loc_y };
	}
}