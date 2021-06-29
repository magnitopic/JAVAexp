package javaExp;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args){
		
		
		do {
			String userR = user();
		};
		while (!userR.equals("1") && !userR.equals("2") && !userR.equals("3") && !userR.equals("r") && !userR.equals("p") && !userR.equals("s") && !userR.equals("rock") && !userR.equals("paper") && !userR.equals("scissors"));
		
	}
	public static String user() {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Rock, paper or scissors? ");
		String user = myObj.nextLine();
		return user;
	}
}
