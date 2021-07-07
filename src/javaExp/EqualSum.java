package javaExp;

public class EqualSum {
	public static void main(String[] args) {
		System.out.println(hasEqualSum(1, -1, 0));
	}

	public static boolean hasEqualSum(int num1, int num2, int num3) {
		if ((num1) + (num2) == (num3)) {
			return true;
		} else {
			return false;
		}
	}
}
