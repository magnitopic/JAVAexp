package javaExp;

import java.util.Scanner;

public class CalulationsWithUserInput {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int total=0,counter=0;
		for (int i=1;counter!=10;i++){
			System.out.print("Enter number #"+i+": ");
			boolean number=scanner.hasNextInt();
			if(number){
				total=total+scanner.nextInt();
				counter++;
			}else{
				System.out.println("Invalid Number");
				scanner.nextLine();
			}
		}
		System.out.println(total);
		scanner.close();
	}
}
