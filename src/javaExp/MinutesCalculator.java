package javaExp;

public class MinutesCalculator {
	public static void main(String[] args) {
		printYearsAndDays(1051200);
	}

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {
			int years = (int) (minutes / 525600), days = (int) ((minutes % 525600) / 1440);
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
		}
	}
}
