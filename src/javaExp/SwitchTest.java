package javaExp;

public class SwitchTest {
	public static void main(String[] args) {
		char myChar = 'B';

		switch (myChar) {
			case 'A':
				System.out.print("Value was A");
				break;
			case 'B':
				System.out.print("Value was B");
				break;
			case 'C':
				System.out.print("Value was C");
				break;
			case 'D':
				System.out.print("Value was D");
				break;
			case 'E':
				System.out.print("Value was E");
				break;
			default:
				System.out.print("Value was neather A,B,C,D or E");
		}
	}
}
