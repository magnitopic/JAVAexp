package javaExp;

import java.util.Scanner;

public class MinMaxInputChallenge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
		while (true) {
			System.out.print("Give me a number(exit to finish): ");
			boolean isInt = scanner.hasNextDouble();
			if (isInt) {
				double num = scanner.nextDouble();
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
			} else if ((max != Double.MIN_VALUE) && (min != Double.MAX_VALUE)) {
				System.out.println("Stoping loop.");
				break;
			} else {
				System.out.println("You need to enter at least 1 number");
				scanner.nextLine();
			}
		}
		scanner.close();
		System.out.println("Max number= " + max);
		System.out.println("Min number= " + min);
	}
}
