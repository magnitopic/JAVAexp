package javaExp;

public class Objects {
	public static void main(String[] args) {
		// Class Car
		Car volkswagen = new Car();
		Car ford = new Car();
		volkswagen.setModel("Golf");
		ford.setModel("Fiesta");
		System.out.println("The model of the car is: " + volkswagen.getModel());
		System.out.println("The model of the car is: " + ford.getModel());
		System.out.println("_________________");

		// Class SimpleCalculator
		SimpleCalculator first = new SimpleCalculator();
		first.setFirstNumber(20);
		first.setSecondNumber(5);
		System.out.println(first.getAdditionResult());
		System.out.println(first.getSubtractionResult());
		System.out.println(first.getMultiplicationResult());
		System.out.println(first.getDivisionResult());
		System.out.println("_________________");

		// Class Person
		Person person = new Person();
		person.setAge(13);
		person.setFirstName("Amela");
		System.out.println(person.getFirstName());
		person.setLastName("Nazarenus");
		System.out.println(person.getLastName());
		System.out.print(person.getFullName());
		System.out.println(" " + person.getAge());
		System.out.println("Is a teen?: " + person.isTeen());
		System.out.println("_________________");

		// class BankAccount
		BankAccount bank = new BankAccount();
		bank.setCustomerName("Jack");
		bank.addValance(10000);
		bank.deductValance(5673);
		bank.addValance(435);
		System.out.println("The bank account of " + bank.getCustomerName() + " with count Nº " + bank.getNumber() + " has a valance of " + bank.getValance() + "€");
		System.out.println("_________________");
	}
}
