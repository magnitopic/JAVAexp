package javaExp;

public class Mitsubishi extends Car2 {
	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Mitsubishi engine is starting.";
	}

	@Override
	public String accelerate() {
		return "Mitsubishi is accelerating.";
	}

	@Override
	public String brake() {
		return "Mitsubishi is braking.";
	}
}
