package javaExp;

public class Objects {
	public static void main(String[] args) {
		// Car
		Car volkswagen = new Car();
		Car ford = new Car();
		volkswagen.setModel("Golf");
		ford.setModel("Fiesta");
		System.out.println("The model of the car is: " + volkswagen.getModel());
		System.out.println("The model of the car is: " + ford.getModel());
		System.out.println("_________________");

		// SimpleCalculator
		SimpleCalculator first = new SimpleCalculator();
		first.setFirstNumber(20);
		first.setSecondNumber(5);
		System.out.println(first.getAdditionResult());
		System.out.println(first.getSubtractionResult());
		System.out.println(first.getMultiplicationResult());
		System.out.println(first.getDivisionResult());
		System.out.println("_________________");

		// Person
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

		// BankAccount
		BankAccount bank = new BankAccount("Jack", "myemail@jack.com", "58546845", 12345, 10000);
		bank.deductBalance(5673);
		bank.addBalance(435);
		System.out.println("The bank account of " + bank.getCustomerName() + " with count Nº " + bank.getNumber()
				+ " has a balance of " + bank.getBalance() + "€");
		System.out.println("_________________");

		// VipCustomer
		VipCustomer customer1 = new VipCustomer();
		System.out.println(customer1.getCreditLimit());
		System.out.println(customer1.getEmail());
		System.out.println(customer1.getName());
		System.out.println("");
		VipCustomer customer2 = new VipCustomer("Jeff", 2333.25);
		System.out.println(customer2.getCreditLimit());
		System.out.println(customer2.getEmail());
		System.out.println(customer2.getName());
		System.out.println("");
		VipCustomer customer3 = new VipCustomer("Jeff", 2333.25, "jeff@email.com");
		System.out.println(customer3.getCreditLimit());
		System.out.println(customer3.getEmail());
		System.out.println(customer3.getName());
		System.out.println("_________________");

		// WallArea
		WallArea wall = new WallArea(200, 567.4);
		System.out.println(wall.getArea());
		System.out.println("_________________");

		// Point
		Point firstPoint = new Point(25, -6);
		Point secondPoint = new Point(50, 50);
		System.out.println(firstPoint.distance());
		System.out.println(firstPoint.distance(43, 65));
		System.out.println(firstPoint.distance(secondPoint));
	}
}
