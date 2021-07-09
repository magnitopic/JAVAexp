package javaExp;

public class LargestPrime {
	public static void main(String[] args) {
		System.out.println(getLargestPrime(1));
	}

	public static int getLargestPrime(int number) {
		if (number <= 1) {
			return -1;
		}
		int cpNumber = number, result = 1;
		while ((number % result != 0) || (result == 1)) {
			result = 1;
			for (; result == 1; cpNumber--) {
				int m = 0, flag = 0;
				int n = cpNumber;
				m = n / 2;
				for (int i = 2; i <= m; i++) {
					if (n % i == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					result = n;
				}
			}
		}

		return result;
	}
}
