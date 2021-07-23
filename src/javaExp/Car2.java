package javaExp;

public class Car2 {
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car2(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}

	public String startEngine() {
		return "Car engine is starting.";
	}

	public String accelerate() {
		return "Car is accelerating.";
	}

	public String brake() {
		return "Car is braking.";
	}

	public int getCylinders() {
		return this.cylinders;
	}

	public String getName() {
		return this.name;
	}
}
