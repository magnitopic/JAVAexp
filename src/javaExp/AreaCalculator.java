package javaExp;

public class AreaCalculator {
	public static void main(String[] args) {
		System.out.println("Area of a circle= " + area(20));
		System.out.println("Area of a rectangle= " + area(10, 50));
	}

	public static double area(double radius) {
		if (radius < 0) {
			return -1;
		} else {
			return (Math.pow(radius, 2)) * Math.PI;
		}

	}

	public static double area(double x, double y) {
		if ((x < 0) || (y < 0)) {
			return -1;
		} else {
			return x * y;
		}
	}
}
