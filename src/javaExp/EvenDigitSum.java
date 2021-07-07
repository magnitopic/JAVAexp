package javaExp;

public class EvenDigitSum {
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(1234567890));
	}

	public static int getEvenDigitSum(int number) {
		if (number >= 0) {
			int num = 0;
			// turn number to an array
			String temp = Integer.toString(number);
			int[] arr = new int[temp.length()];
			for (int i = 0; i < temp.length(); i++) {
				arr[i] = temp.charAt(i) - '0';
			}
			// cheek all values to see if even, if ture, sum them
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					num = num + arr[i];
				}
			}
			return num;
		}
		return -1;
	}
}
