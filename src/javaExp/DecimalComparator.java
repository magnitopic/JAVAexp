package javaExp;

public class DecimalComparator {
	public static void main(String[] args) {
		System.out.print(areEqualByThreeDecimalPlaces(2.1575, 2.157));
	}

	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
		int newNum1 = (int) (num1 *= 1000);
		int newNum2 = (int) (num2 *= 1000);
		if (newNum1 == newNum2) {
			return true;
		} else {
			return false;
		}
	}
}
