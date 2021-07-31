package javaExp;

import java.util.Scanner;

public class SortedArray {
	public static int[] getIntegers(int params) {
		Scanner scaner=new Scanner(System.in);
		int[] myArray = new int[params];
		for(int i=0;i<myArray.length;i++){
			myArray[i]=scaner.nextInt();
		}
		scaner.close();
		return myArray;
	}

	public static void printArray(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Element " + i + " contents " + myArray[i]);
		}
	}

	public static int[] sortIntegers(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {
				if (myArray[i] > myArray[j]) {
					int temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		return myArray;
	}

	public static void main(String[] args) {
		int[] myArray = { 5, 7, 3, 23, 10, 4, 100 };
		myArray=sortIntegers(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.err.println(myArray[i]);
		}
	}
}
