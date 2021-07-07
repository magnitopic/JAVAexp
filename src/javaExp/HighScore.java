package javaExp;

public class HighScore {
	public static void main(String[] args) {
		String name = "mag";
		double[] scores = new double[] { 1500, 900, 400, 50 };

		for (double i : scores) {
			displayHighScorePosition(name, i);
			System.out.println(calculateHighScorePosition(i));
			System.out.println("____________________");
		}

	}

	public static void displayHighScorePosition(String name, double score) {
		System.out.println(name + " managed to get to position " + score + " on the high score table");
	}

	public static int calculateHighScorePosition(double score) {
		if (score > 1000) {
			return 1;
		} else if (score > 500) {
			return 2;
		} else if (score > 100) {
			return 3;
		}
		return 4;
	}
}
