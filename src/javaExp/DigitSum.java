package javaExp;

public class DigitSum {
	public static void main(String[] args) {
		int number=456;
		System.out.println("The sum of the digits of "+number+" is equal to "+sumDigits(number)); 
	}
	public static int sumDigits(int number){
		if (number>=10){
			int sum=0;
			while(number!=0){
				int provisional=(number%10);
				number=number/10;
				sum=sum+provisional;
			}
			return sum;
		} else{
			return -1;
		}
	}
}
