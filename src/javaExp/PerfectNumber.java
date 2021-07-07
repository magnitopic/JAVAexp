package javaExp;

public class PerfectNumber {
	public static void main(String[] args) {
		// 6 is true because it's divisors are 1,2,3 an their sum is 6
		for (int i = 0; i < 20; i++) {
			System.out.println("Is " + i + " a perfect number? " + isPerfectNumber(i));
		}
	}

	public static boolean isPerfectNumber(int number) {
		if (number > 1) {
			int numbers = 0;
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					numbers = numbers + i;
				}
			}
			if (numbers == number) {
				return true;
			}
		}
		return false;
	}
}
