package javaExp;

public class SumOdd {
	public static int sumOdd(int start, int end) {
		if ((start <= end) && (start > 0)) {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				if (isOdd(i)) {
					sum = sum + i;
				}
			}
			return sum;
		} else {
			return -1;
		}

	}

	public static boolean isOdd(int number) {
		if ((number < 0) || (number % 2 == 0)) {
			return false;
		} else {
			return true;
		}
	}
}
