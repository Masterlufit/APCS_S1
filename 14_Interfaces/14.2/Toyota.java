
public class Toyota extends Car {
	public Toyota(String loc) {
		int x, y;
		try {
			String[] loc_string = loc.split(", ");
			location = new double[] { Double.parseDouble(loc_string[0]), Double.parseDouble(loc_string[1]) };
		} catch (NumberFormatException e) {
			System.out.println("Invalid Location! X and Y are defaulted to 0!");
			location = new double[] { 0, 0 };
		}
	}
}