package javaExp;

public class CalculateInterest {
	public static void main(String[] args) {
		double amount = 10000;
		for (int i = 2; i <= 8; i++) {
			System.out.println(String.format("%.2f", calculateInterest(amount, i)) + " € of interest at " + i + "% interest");
		}
		System.out.println("_________________");
		for (int i = 8; i >= 2; i--) {
			System.out.println(String.format("%.2f", calculateInterest(amount, i)) + " € of interest at " + i + "% interest");
		}
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
}