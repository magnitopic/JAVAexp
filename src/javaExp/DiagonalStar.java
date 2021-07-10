package javaExp;

public class DiagonalStar {
	public static void main(String[] args) {
		printSquareStar(20);
	}

	public static void printSquareStar(int number) {
		if (number < 5) {
			System.out.print("Invalid Value");
		} else {
			// number or rows
			for (int i = 0; i < number; i++) {
				// number of columns
				for (int j = 0; j < number; j++) {
					if (j == (number - 1)) {
						System.out.println("*");
					} else if (i == 0 || i == (number - 1) || j == 0 || j == i || (j == ((number - i) - 1))) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
		}
	}
}
