package javaExp;

public class LastDigitChecker {
	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(123, 129, 769));
		System.out.println(isValid(500));
	}

	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		if ((num1 >= 10) && (num1 <= 1000) && (num2 >= 10) && (num2 <= 1000) && (num3 >= 10) && (num3 <= 1000)) {
			int firstDigitNum1 = (num1 % 10);
			int firstDigitNum2 = (num2 % 10);
			int firstDigitNum3 = (num3 % 10);
			if ((firstDigitNum1 == firstDigitNum2) || (firstDigitNum2 == firstDigitNum3)
					|| (firstDigitNum1 == firstDigitNum3)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isValid(int number) {
		if ((number >= 10) && (number <= 1000)) {
			return true;
		}
		return false;
	}
}
