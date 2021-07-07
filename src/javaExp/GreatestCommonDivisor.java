package javaExp;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25, 15));
	}

	public static int getGreatestCommonDivisor(int first, int second) {
		if ((first >= 10) && (second >= 10)) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 1; i < Math.max(first, second); i++) {
				if ((first % i == 0) && (second % i == 0)) {
					list.add(i);
				}
			}
			return Collections.max(list);
		}
		return -1;
	}
}
