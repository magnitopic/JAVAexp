package javaExp;

public class Vehicle {
	private int currentVelocity;
	private int currentDirection;
	private String name;
	private String size;

	public Vehicle(String name, String size) {
		this.currentVelocity = 0;
		this.currentDirection = 0;
		this.name = name;
		this.size = size;
	}

	public void steer(int direction) {
		this.currentDirection += direction;
	}

	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
	}

	public void stop() {
		currentVelocity = 0;
	}

	public int getCurrentVelocity() {
		return this.currentVelocity;
	}

	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	public int getCurrentDirection() {
		return this.currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
