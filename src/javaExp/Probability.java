package javaExp;

import java.util.ArrayList;

public class Probability {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < 25; i++) {
			double rnd = Math.random();
			if (rnd < 0.1) {
				array.add(Integer.valueOf(0));
			} else {
				array.add(Integer.valueOf(1));
			}
		}
		System.out.println(array);
	}
}
