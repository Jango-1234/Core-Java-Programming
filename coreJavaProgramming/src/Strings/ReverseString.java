package Strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		String rev = "";

		// Logic-1 using charAt() method
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		// Logic-2 using character Array
		/*
		 * char a[] = str.toCharArray(); 
		 * for (int i = str.length() - 1; i >= 0; i--) {
		 * rev =rev + a[i]; 
		 * }
		 */

		// Logic-3 using StringBuffer class
		/* StringBuffer sb =new StringBuffer(str);
		 *  StringBuffer rev = sb.reverse();
		 * System.out.println("Reversed string: " + rev);
		 *  }
		 */

	}
}
