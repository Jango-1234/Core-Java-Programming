package Arrays;

import java.util.Scanner;

public class ScannerClassInputFromKeyBoardAtRunTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Given number is:" + num);

		System.out.println("Enter a decimal number:");
		double num1 = sc.nextDouble();
		System.out.println("Given number is:" + num1);

		System.out.println("Enter your city");
		String city = sc.next();
		System.out.println("your city is:" + city);

		System.out.println("Enter unknown value");
		Object value = sc.next();
		System.out.println(value);

		System.out.println("Enter first number:");
		int num3 = sc.nextInt();

		System.out.println("Enter second number:");
		int num4 = sc.nextInt();

		System.out.println("Addition of 2 numbers:" + (num3 + num4));

	}

}
