package javaExp;

import java.util.Scanner;

public class RockPaperScissors {
	private String userChoice;
	private int userChoiceNumber;
	private int machineChoice;
	private int userPoints;
	private int machinePoints;

	private void generateMachineChoice() {
		machineChoice = (int) (Math.random() * 3) + 1;
	}

	private int readUserChoice(String userChoice) {
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

	private void determineWiner() {
		if (this.userChoiceNumber == this.machineChoice) {
			System.out.println("Ther was a tie. You both used " + userChoice);
		} else if ((userChoiceNumber == 1 && machineChoice == 3) || (userChoiceNumber == 2 && machineChoice == 1)
				|| (userChoiceNumber == 3 && machineChoice == 2)) {
			System.out.println("You win!! Using " + userChoice);
			userPoints++;
		} else {
			System.out.println("You loose... Using " + userChoice);
			machinePoints++;
		}
	}

	private void getUserChoice(Scanner input) {
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
	}

	public void playGame() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Who may points are we playing to?(min 1): ");
			boolean isAnInt = scanner.hasNextInt();
			if (isAnInt) {
				int repetitions = scanner.nextInt();
				scanner.nextLine();
				if (repetitions <= 0) {
					System.out.println("Input not valid.");
				} else {
					while (this.machinePoints < repetitions && this.userPoints < repetitions) {
						getUserChoice(scanner);
						generateMachineChoice();
						determineWiner();
						System.out.println("You have " + this.userPoints + " points and the machine has "
								+ this.machinePoints + " points.");
					}
					break;
				}
			}
		}
		scanner.close();
		System.out.println("Game Over... Insert coin.");
	}

	public static void main(String[] args) {
		RockPaperScissors game1 = new RockPaperScissors();
		game1.playGame();
	}
}
