import java.util.*;

public class GameSystem {
	private String platform;
	private int sn;

	public GameSystem(String p) {
		this.platform = p;
		Random r = new Random();
		this.sn = r.nextInt(10000000);
	}

	public String getPlatform() {
		return this.platform;
	}

	public int getSerial() {
		return this.sn;
	}
}
