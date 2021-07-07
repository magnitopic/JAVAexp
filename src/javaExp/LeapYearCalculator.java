package javaExp;

public class LeapYearCalculator {
	public static void main(String[] args) {
		System.out.print(isLeapYear(1800));
	}

	public static boolean isLeapYear(int year) {
		if ((year >= 1) && (year < 9999) && (year % 4 == 0)) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
