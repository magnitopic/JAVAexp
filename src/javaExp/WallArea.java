package javaExp;

public class WallArea {
	private double height;
	private double width;

	public WallArea(double width, double height) {
		if (height < 0) {
			this.height = 0;
		} else {
			this.height = height;
		}
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public WallArea() {

	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			this.height = 0;
		} else {
			this.height = height;
		}
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public double getArea() {
		return width * height;
	}
}
