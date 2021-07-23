package javaExp;

public class Objects {
	public static void main(String[] args) {
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
		System.out.println("_________________");

		// Calculator / Carpet / Floor
		Floor floor = new Floor(20.5, 2.3);
		Carpet carpet = new Carpet(8); // 8€ it costs per m2 of carpet
		Calculator calculator = new Calculator(floor, carpet);
		System.out.println(calculator.getTotalCost());
		System.out.println("_________________");

		// ComplexNumber
		ComplexNumber num1 = new ComplexNumber(1, 1);
		ComplexNumber num2 = new ComplexNumber(2.5, -1.5);
		num1.add(1, 1);
		System.out.println("num1 real= " + num1.getReal());
		System.out.println("num1 imaginary= " + num1.getImaginary());
		num1.subtract(num2);
		System.out.println("num1 real= " + num1.getReal());
		System.out.println("num1 imaginary= " + num1.getImaginary());
		num2.subtract(num1);
		System.out.println("num2 real= " + num2.getReal());
		System.out.println("num2 imaginary= " + num2.getImaginary());
		System.out.println("_________________");

		// Vehicle Car Golf
		Golf golf = new Golf(36);
		golf.steer(45);
		golf.accelerate(30);
		golf.accelerate(20);
		golf.accelerate(-42);
		System.out.println("velocity = " + golf.getCurrentVelocity() + " direction = " + golf.getCurrentDirection());
		System.out.println("_________________");

		// Circle Cylinder
		Cylinder cylinder = new Cylinder(20, 10);
		System.out.println(cylinder.getHeight() + " is the height of the cylinder");
		System.out.println(cylinder.getRadius() + " is the radius of the cylinder");
		System.out.println(cylinder.getVolume() + " is the volume of the cylinder");
		System.out.println("_________________");

		// Rectangle Cuboid
		Cuboid cuboid = new Cuboid(20, 5, 10);
		System.out.println("Lenght = " + cuboid.getLength());
		System.out.println("Width = " + cuboid.getWidth());
		System.out.println("Volume = " + cuboid.getVolume());
		System.out.println("Heigth = " + cuboid.getHeight());
		System.out.println("Area = " + cuboid.getArea());
		System.out.println("_________________");

		// Bedroom Wall Ceiling Bed Lamp
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");
		Ceiling ceiling = new Ceiling(12, 55);
		Bed bed = new Bed("modern", 4, 3, 2, 1);
		Lamp lamp = new Lamp("Classic", false, 75);
		Bedroom bedroom = new Bedroom("My beadroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		bedroom.makeBed();
		System.out.println("_________________");

		// Printer
		Printer printer = new Printer(50, true);
		printer.addToner(50);
		System.out.println(printer.printPages(34));
		printer.printPages(184);
		System.out.println("Pages printed total = " + printer.getPagesPrinted());
		System.out.println("_________________");

	}
}
