package javaExp;

public class Ford extends Car2 {
	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Ford engine is starting.";
	}

	@Override
	public String accelerate() {
		return "Ford is accelerating.";
	}

	@Override
	public String brake() {
		return "Ford is braking.";
	}
}
