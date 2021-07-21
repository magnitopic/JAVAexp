package javaExp;

import java.util.Scanner;

public class RockPaperScissors {
	private String userChoice;
	private int userChoiceNumber;
	private int machineChoice;
	private int userPoints;
	private int machinePoints;

	public void generateMachineChoice() {
		machineChoice = (int) (Math.random() * 3) + 1;
	}

	public int readUserChoice(String userChoice) {
		if (userChoice.equals("rock")) {
			return 1;
		} else if (userChoice.equals("paper")) {
			return 2;
		} else if (userChoice.equals("scisors")) {
			return 3;
		} else {
			return 0;
		}
	}

	public void determineWiner() {
		if (this.userChoiceNumber == this.machineChoice) {
			System.out.println("Ther was a tie.");
		} else if ((userChoiceNumber == 1 && machineChoice == 3) || (userChoiceNumber == 2 && machineChoice == 1)
				|| (userChoiceNumber == 3 && machineChoice == 2)) {
			System.out.println("You win!! Using " + userChoice);
			userPoints++;
		} else {
			System.out.println("You loose... Using " + userChoice);
			machinePoints++;
		}
	}

	public void head(Scanner input) {
		while (true) {
			System.out.print("Rock, paper or scisors: ");
			userChoice = input.nextLine().toLowerCase();
			this.userChoiceNumber = readUserChoice(userChoice);
			if (userChoiceNumber == 0) {
				System.out.println("Your input was not valid. Try again.");
			} else {
				break;
			}
		}
		generateMachineChoice();
		determineWiner();
	}

	public static void main(String[] args) {
		RockPaperScissors rps = new RockPaperScissors();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Who may points are we playing to?(min 1): ");
			boolean isAnInt = scanner.hasNextInt();
			if (isAnInt) {
				int repetitions = scanner.nextInt();
				scanner.nextLine();
				if (repetitions <= 0) {
					System.out.println("Input not valid.");
					// scanner.close();
				} else {
					// scanner.close();
					while (rps.machinePoints < repetitions && rps.userPoints < repetitions) {
						rps.head(scanner);
						System.out.println("You have " + rps.userPoints + " points and the machine has "
								+ rps.machinePoints + " points.");
					}
					break;
				}
			}
		}
		scanner.close();
		System.out.println("Game Over... Insert coin.");
	}
}
