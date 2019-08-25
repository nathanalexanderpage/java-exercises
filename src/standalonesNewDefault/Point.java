package standalonesNewDefault;

public class Point {
	int x;
	int y;
	public Point(int initialX, int initialY) {
		x = initialX;
		y = initialY;
	}
	public void setLocation(int newX, int newY) {
		x = newX;
		y = newY;
	}
	public String dispStr() {
		return "(" + x + ", " + y + ")";
	}
	public double distance(Point second) {
		return Math.sqrt(Math.abs(Math.pow((second.x - x), 2) + Math.pow((second.y - y), 2)));
	}
}
