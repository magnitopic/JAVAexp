package javaExp;

public class Floor {
	private double length;
	private double width;

	public Floor(double length, double width) {
		if (this.length < 0) {
			this.length = 0;
		} else {
			this.length = length;
		}
		if (this.length < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public double getArea() {
		return width * length;
	}
}
