package dayOne;

import java.util.Scanner;

public class LeapYearVerification {
	public static void main(String[] args) {
		System.out.print("Enter a Year:");
		Scanner input = new Scanner(System.in);
		// take input from the user

		int number = input.nextInt();
		System.out.println(number);
		if (number >= 1582 && number%4 ==0 && number%100 != 0) {
			System.out.println("Year " + number + " is a Leap Year");
		} else if (number >= 1582 && number%400 ==0) {
			System.out.println("Year " + number + " is a Leap Year");
		} else {
			System.out.println("Year " + number + " is not a Leap Year");
		}

	}
}