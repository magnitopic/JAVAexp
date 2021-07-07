package javaExp;

public class FirstAnLastDigitSum {
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(593478282));
	}

	public static int sumFirstAndLastDigit(int number) {
		if (number >= 0) {
			// turn number to an array
			String temp = Integer.toString(number);
			int[] arr = new int[temp.length()];
			for (int i = 0; i < temp.length(); i++) {
				arr[i] = temp.charAt(i) - '0';
			}
			// return the values
			return (arr[arr.length - 1]) + (arr[0]);
		} else {
			return -1;
		}
	}
}
