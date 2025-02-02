package JavaPrograms;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Approach1
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reversed num is:" + rev);
		
		//Approach2 using StringBuffer()
		System.out.println("Enter a number1:");
		int num1 = sc.nextInt();
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse()); 
	}

}
