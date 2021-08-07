package javaExp;

public class ReverseArray {
	private static void reverse(int[] array) {
		System.out.print("Array = [");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
		for (int i = 0; i <= ((array.length - 1) / 2); i++) {
			int temp = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = temp;
		}
		System.out.print("Reversed array = [");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		reverse(array);
	}
}
