package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		this.length=l;
		this.width=w;
	}
	public double area() {
		return length*width;
	}
	public double perim() {
		return 2*length + 2*width;
	}
	public boolean smallerArea(Rectangle r) {
		double area1 = this.area();
		double area2 = r.area();
		if (area1 > area2) {
			return false;
		}
		return true;
	}
	public boolean square() {
		if (this.length == this.width) {
			return true;
		}
		return false;
	}
public static void main(String args[]) {
	Rectangle r1 = new Rectangle (2,2);
	Rectangle r2 = new Rectangle (2,4);
	System.out.println(r1.square());
}
}
