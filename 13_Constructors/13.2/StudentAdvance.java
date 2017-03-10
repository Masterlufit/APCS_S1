public class StudentAdvance extends Advance {

	public StudentAdvance(int dl) {
		super(dl);
	}

	public int getPrice() {
		return super.getPrice() / 2;
	}
}