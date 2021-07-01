package javaExp;

public class SpeedConverter {
	public static void main(String[] args){
		double kilometersPerHour=95.75;
		printConversion(kilometersPerHour);
	}
	public static long toMilesPerHour(double kilometersPerHour){
		if (kilometersPerHour<0){
			return -1;
		}else{
			return Math.round(kilometersPerHour * 0.621371);
		}
	}
	public static void printConversion(double kilometersPerHour){
		long calculo=toMilesPerHour(kilometersPerHour);
		if (calculo== -1){
			System.out.print("Invalid Value");
		}else{
			System.out.println(kilometersPerHour+" km/h = "+calculo+" mi/h");
		}
	}
}
