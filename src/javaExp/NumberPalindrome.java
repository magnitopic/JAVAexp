package javaExp;
public class NumberPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(-801108));
	}
	public static boolean isPalindrome(int number){
		int reversed=0,number2=number;
		for(;number != 0; number /= 10) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
		}
		if (reversed==number2){
			
			return true;
		}
		return false;
	}
}
