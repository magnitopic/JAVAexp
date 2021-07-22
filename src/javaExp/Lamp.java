package javaExp;

public class Lamp {
	private boolean battery;
	private String style;
	private int globRating;

	public Lamp(String style, boolean battery, int globRating) {
		this.battery = battery;
		this.style = style;
		this.globRating = globRating;
	}

	public void turnOn() {
		System.out.println("Lamp is on");
	}

	public boolean isBattery() {
		return this.battery;
	}

	public String getStyle() {
		return this.style;
	}

	public int getGlobRating() {
		return this.globRating;
	}

}
