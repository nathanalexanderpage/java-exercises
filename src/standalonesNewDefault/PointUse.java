package standalonesNewDefault;

public class PointUse {
	public static void main(String[] args) {
		Point origin = new Point(0, 0);
		origin.x = 0;
		origin.y = 0;
		Point p1 = new Point(0, 0);
		p1.x = 2;
		Point p2 = new Point(0, 0);
		p2.y = 5;
		p2.setLocation(0, 3);
		System.out.println("p2\'s position: " + p2.dispStr());
		System.out.println("p2\'s distance from the origin: " + p2.distance(origin));
	}
}
