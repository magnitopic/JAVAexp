package javaExp;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args){
		
		do{
			Example.AnsUser=user();
		}
		while (Example.AnsUser!="mag");

	}
	public abstract class Example {
		public static final String AnsUser;
	}
	public static String user() {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Rock, paper or scissors? ");
		String user = myObj.nextLine();
		return user;
	}
}
