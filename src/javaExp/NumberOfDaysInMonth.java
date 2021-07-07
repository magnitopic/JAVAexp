package javaExp;

public class NumberOfDaysInMonth {
	public static void main(String[] args) {
		System.out.println(getDaysInMonth(2, 2016));
	}

	public static boolean isLeapYear(int year) {
		if ((year >= 1) && (year <= 9999)) {
			if (year % 4 == 0) {
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
		} else {
			return false;
		}
	}

	public static int getDaysInMonth(int month, int year) {
		if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
			return -1;
		} else {
			int var = 0;
			if (isLeapYear(year)) {
				switch (month) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						var = 31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						var = 30;
						break;
					case 2:
						var = 29;
						break;
				}
			} else {
				switch (month) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						var = 31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						var = 30;
						break;
					case 2:
						var = 28;
						break;
				}
			}
			return var;
		}
	}
}
