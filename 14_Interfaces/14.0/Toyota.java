import java.util.*;

public class Toyota implements Location{
	private double[] location;

	public Toyota(String loc) {
		try{
			String[] loc_string = loc.split(", ");
			this.location = new double[] {Double.parseDouble(loc_string[0]),Double.parseDouble(loc_string[1])};
		}catch(NumberFormatException e){
			System.out.println("Invalid Location! X and Y are defaulted to 0!");
			this.location = new double[] {0,0};
		}
	}

	public int getID() {
		Random r = new Random();
		return r.nextInt(1000000);
	}

	public void move(double x, double y) {
		this.location = new double[] {x,y};
	}

	public double[] getLoc() {
		return location;
	}
}