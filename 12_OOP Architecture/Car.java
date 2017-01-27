public class Car {
	static String paint, interior, engine, tire;

	public Car() {
		paint = "Default";
		interior = "Default";
		engine = "Default";
		tire = "Default";
	}

	public Car(String p, String i, String e, String t) {
		paint = p;
		interior = i;
		engine = e;
		tire = t;
	}

	public static void customBuild(String p, String i, String e, String t) {
		paint = p;
		interior = i;
		engine = e;
		tire = t;
	}

	public String getPaint() {
		return paint;
	}

	public String getInterior() {
		return interior;
	}

	public String getEngine() {
		return engine;
	}

	public String getTire() {
		return tire;
	}
}
