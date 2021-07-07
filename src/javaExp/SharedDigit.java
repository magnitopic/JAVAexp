package javaExp;

public class SharedDigit {
	public static void main(String[] args) {
		int num1 = 12, num2 = 43;
		System.out.println(hasSharedDigit(num1, num2));
	}

	public static boolean hasSharedDigit(int num1, int num2) {
		if (((num1 >= 10) && (num1 <= 99)) && ((num2 >= 10) && (num2 <= 99))) {
			// turn both numbers into arrays
			String temp = Integer.toString(num1);
			int[] arr1 = new int[temp.length()];
			for (int i = 0; i < temp.length(); i++) {
				arr1[i] = temp.charAt(i) - '0';
			}

			String temp2 = Integer.toString(num2);
			int[] arr2 = new int[temp2.length()];
			for (int i = 0; i < temp2.length(); i++) {
				arr2[i] = temp2.charAt(i) - '0';
			}

			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					if (arr1[i] == arr2[j]) {
						return true;
					}
				}
			}

		}
		return false;
	}
}
