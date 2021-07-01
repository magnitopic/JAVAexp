package javaExp;

public class SpeedConverter {
	public static void main(String[] args){
		double kilometersPerHour=100;
		System.out.println(toMilesPerHour(kilometersPerHour)+" MPH");
		printConversion(kilometersPerHour);
	}
	public static long toMilesPerHour(double kilometersPerHour){
		if (kilometersPerHour<=0){
			return -1;
		}else{
			return Math.round(kilometersPerHour * 0.621371);
		}
	}
	public static void printConversion(double kilometersPerHour){
		if (kilometersPerHour<=0){
			System.out.print("Invalid Value");
		}else{
			System.out.println(kilometersPerHour+"km/h = "+Math.round(kilometersPerHour * 0.621371)+"MPH");
		}
	}
}
