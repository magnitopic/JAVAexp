package javaExp;
import java.util.Scanner;

public class RockPaperScissors {
	private int userChoice;
	private int userChoiceNumber;
	private int machineChoice;
	private int userPoints;
	private int machinePoints;

	public void generateMachineChoice(){
		this.machineChoice=(int)(Math.random()*3)+1;
	}

	public int readUserChoice(String userChoice){
		String lowerUserChoice=userChoice.toLowerCase();
		if(lowerUserChoice.equals("rock")){
			return 1;
		}else if (lowerUserChoice.equals("paper")){
			return 2;
		}else if(lowerUserChoice.equals("scisors")){
			return 3;
		}else{
			return -1;
		}
	}

	public void determineWiner(){
		if(this.userChoiceNumber==this.machineChoice){
			System.out.println("Ther was a tie.");
		}else if((userChoiceNumber==1&&machineChoice==3)||(userChoiceNumber==2&&machineChoice==1)||(userChoiceNumber==3&&machineChoice==2)){
			System.out.println("You win!! Using "+userChoice);
			userPoints++;
		}else{
			System.out.println("You loose... Using "+userChoice);
			machinePoints++;
		}
	}

	public void head(Scanner input){
		int userInput=0;
		while(true){
			System.out.print("Rock, paper or scisors: ");
			userInput=readUserChoice(input.nextLine());
			if(userInput==-1){
				System.out.println("Your input was not valid. Try again.");
			}else{
				this.userChoiceNumber=userInput;
				break;
			}
		}
		generateMachineChoice();
		determineWiner();
	}

	public static void main(String[] args) {
		RockPaperScissors r=new RockPaperScissors();
		Scanner scanner=new Scanner(System.in);
		while(true){
			System.out.print("Who may points are we playing to?(min 1): ");
			boolean isAnInt=scanner.hasNextInt();
			if(isAnInt){
				int repetitions=scanner.nextInt();
				scanner.nextLine();
				if(repetitions<=0){
					System.out.println("Input not valid.");
					// scanner.close();
				}else{
					// scanner.close();
					while(r.machinePoints<repetitions&&r.userPoints<repetitions){
						r.head(scanner);
						System.out.println("You have "+r.userPoints+" points and the machine has "+r.machinePoints+" points.");
					}
					break;
				}
			}
		}
		scanner.close();
	}
}
