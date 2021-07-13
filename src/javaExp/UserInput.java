package javaExp;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("What's your year of birth?");
		int yearOfBirth=scanner.nextInt();
		scanner.nextLine();

		System.out.println("What's your name?");
		String name=scanner.nextLine();

		System.out.println("Your name is "+name+" and you are "+(2021-yearOfBirth)+" years old");
		scanner.close();
	}
}
