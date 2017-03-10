public class _GameRunner {
	public static void main(String[] args) {
		GameSystem xbox =new XBox();
		GameSystem ps = new PS();
		GameSystem pc = new PC();

		p(xbox.toString());
		p(ps.toString());
		p(pc.toString());
	}

	public static void p(String msg) {
		System.out.println(msg);
	}
}
