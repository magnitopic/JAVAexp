package javaExp;
import java.util.Scanner;

public class SecretNumberGame {
	public static void main(String[] args) {
		System.out.println("Wellcome to the secret the number game!!\n");
		System.out.println("The computer will secretly choose a number between 1-100, bouth included.\nYou must guess it.\nBest of luck!\n");
		byte number=(byte)(Math.random()*99+1);
		
		do ;
		while (question(number)!=number);
	}

	public static double question(byte number){
		Scanner input = new Scanner(System.in);
		System.out.print("What's your guess?: ");
		String user = input.nextLine();
		int guess = Integer.parseInt(user);
		//Fixing the memory leak only asks the user once
		//input.close();
		check(guess, number);
		return guess;
	}
	
	public static void check(int guess,byte number){
		if (guess==number) {
			System.out.print("Congratulations!! You guessed the secret number.\nIt was number "+number);
		}else if(guess>=number) {
			System.out.print("The number is smaller.\n");
		}else if(guess<=number) {
			System.out.print("The number is bigger.\n");
		}
	}
}