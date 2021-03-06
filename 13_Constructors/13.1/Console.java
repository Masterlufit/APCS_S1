public abstract class Console extends GameSystem {
	public Console(String p) {
		super(p);
	}

	public abstract String getController();

	public String toString() {
		return "Platform: " + super.getPlatform() + "\nSerial: " + super.getSerial() + "\nController: "
				+ getController();
	}
}
