package javaExp;

import java.util.Scanner;

public class MinimumElement {
	private static int readInteger() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter the amount fo number that the array will have: ");
			boolean isInt = scanner.hasNextInt();
			if (isInt) {
				return scanner.nextInt();
			} else {
				System.out.println("Invalid number. Try again.");
				scanner.nextLine();
			}
		}
	}

	private static int[] readElements(int param) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(param);
		int[] array = new int[param];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Give me a value for number " + i + ": ");
			array[i] = scanner.nextInt();
		}
		scanner.close();
		return array;
	}

	private static int findMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println("The minimum element of the group is: " + findMin(readElements(readInteger())));
	}
}
