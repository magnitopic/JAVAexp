package javaExp;

//Creating the usual car object in Java

public class Car extends Vehicle {
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;

	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public void changeVelocity(int speed, int direction) {
		move(speed, direction);
	}

	public int getWheels() {
		return this.wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return this.doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getGears() {
		return this.gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public boolean isIsManual() {
		return this.isManual;
	}

	public boolean getIsManual() {
		return this.isManual;
	}

	public void setIsManual(boolean isManual) {
		this.isManual = isManual;
	}

	public int getCurrentGear() {
		return this.currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

}
