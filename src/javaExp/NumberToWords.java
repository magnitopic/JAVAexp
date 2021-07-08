package javaExp;

public class NumberToWords {
	public static void main(String[] args) {
		numberToWords(11000);
	}

	public static void numberToWords(int number) {
		String word = "";
		if (number < 0) {
			System.out.println("Invalid Value");
		} else if (number == 0) {
			word = "Zero";
			System.out.println(word);
		} else {
			int numCopy = number;
			number = reverse(number);
			for (; number != 0; number /= 10) {
				switch (number % 10) {
					case 1:
						word = word + "One ";
						break;
					case 2:
						word = word + "Two ";
						break;
					case 3:
						word = word + "Three ";
						break;
					case 4:
						word = word + "Four ";
						break;
					case 5:
						word = word + "Five ";
						break;
					case 6:
						word = word + "Six ";
						break;
					case 7:
						word = word + "Seven ";
						break;
					case 8:
						word = word + "Eight ";
						break;
					case 9:
						word = word + "Nine ";
						break;
					case 0:
						word = word + "Zero ";
						break;
				}
			}
			int diference = getDigitCount(numCopy) - getDigitCount(reverse(numCopy));
			while ((diference > 0)) {
				word = word + "Zero ";
				diference--;
			}
			System.out.println(word);
		}
	}

	public static int reverse(int number) {
		int reversed = 0;
		for (; number != 0; number /= 10) {
			reversed = reversed * 10 + (number % 10);
		}
		return reversed;
	}

	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		}
		String temp = Integer.toString(number);
		int[] arr = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			arr[i] = temp.charAt(i) - '0';
		}
		return arr.length;

	}
}
