package lab_2;

public class Distance {
	int x1, x2, y1, y2;
	double dis;

	public Distance() {
		x1 = x2 = y1 = y2 = 0;
		dis = 0.0;
	}

	public Distance(int xx1, int xx2, int yy1, int yy2) {
		x1 = xx1;
		x2 = xx2;
		y1 = yy1;
		y2 = yy2;
		dis = 0.0;
	}

	public void setValues() {
		x1 = x2 = y1 = y2 = 0;
	}

	public double getDis() {
		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return dis;
	}
}
