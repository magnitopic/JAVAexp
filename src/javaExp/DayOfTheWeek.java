package javaExp;

public class DayOfTheWeek {
	public static void main(String[] args) {
		prinDayOfTheWeek(0);
	}
	
	public static void prinDayOfTheWeek(int day){
		switch(day) {
		case 0:
			System.out.print("Moday");
			break;
		case 1:
			System.out.print("Tuesday");
			break;
		case 2:
			System.out.print("Wednesday");
			break;
		case 3:
			System.out.print("Thursday");
			break;
		case 4:
			System.out.print("Friday");
			break;
		case 5:
			System.out.print("Saturday");
			break;
		case 6:
			System.out.print("Sunday");
			break;
		default:
			System.out.print("Invalid day");
		}
	}
}
