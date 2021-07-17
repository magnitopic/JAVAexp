package javaExp;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance() {
		return Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
	}

	public double distance(int x, int y) {
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}

	public double distance(Point secondPoint) {
		return Math.sqrt((secondPoint.x - this.x) * (secondPoint.x - this.x) + (secondPoint.y - this.y) * (secondPoint.y - this.y));
	}
}
