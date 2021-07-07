package javaExp;

public class AllFactors {
	public static void main(String[] args) {
		printFactors(12345);
	}

	public static void printFactors(int number) {
		if (number >= 1) {
			String numbers = "";
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					numbers = numbers + i + " ";
				}
			}
			System.out.println(numbers);
		} else {
			System.out.println("Invalid Value");
		}
	}
}
