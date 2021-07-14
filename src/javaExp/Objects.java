package javaExp;

public class Objects {
	public static void main(String[] args) {
		Car volkswagen = new Car();
		Car ford = new Car();
		volkswagen.setModel("Golf");
		ford.setModel("Fiesta");

		System.out.println("The model of the car is: " + volkswagen.getModel());
		System.out.println("The model of the car is: " + ford.getModel());
	}
}
