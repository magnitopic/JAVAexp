package javaExp;

public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("DeluxBurguer", "Meat patty, ", 14.54, "Bun");
		super.addHamburgerAddition1("Chips", 2.75);
		super.addHamburgerAddition2("Drink", 1.81);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("Delux Burgers don't have extra ingredients.");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("Delux Burgers don't have extra ingredients.");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("Delux Burgers don't have extra ingredients.");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("Delux Burgers don't have extra ingredients.");
	}
}
