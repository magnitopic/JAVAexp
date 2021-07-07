package javaExp;

public class SumThreeAndFive {
	public static void main(String[] args) {
		int counter = 0;
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (counter != 5) {
				if ((i % 3 == 0) && (i % 5 == 0)) {
					sum = sum + i;
					counter++;
				}
			} else {
				break;
			}
		}
		System.out.println(sum + " is the sum of all the first " + counter + " divisible numbers between 3 and 5");
	}
}
