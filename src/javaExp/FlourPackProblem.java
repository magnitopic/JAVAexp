package javaExp;

public class FlourPackProblem {
	public static void main(String[] args) {
		System.out.println(canPack(3, 2, 12));
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount >= 0 && smallCount >= 0) {
			int total = 0;
			int diference = goal - total;
			while ((diference / 5 != 0) && (bigCount > 0)) {
				total = total + 5;
				bigCount--;
				diference = goal - total;
			}
			while ((diference != 0) && (smallCount > 0)) {
				total = total + 1;
				diference = goal - total;
				smallCount--;
			}
			if (total == goal) {
				return true;
			}
		}
		return false;
	}
}
