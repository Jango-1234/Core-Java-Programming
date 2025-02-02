package Arrays;

import java.util.Scanner;

public class EvenAndOddNumbersInAnArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the taget number to check..");
		int target = sc.nextInt();
		Boolean found = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				found = true;
				if ((a[i] % 2) == 0) {
					System.out.println("Odd number..");
				} else {
					System.out.println("Even number..");
				}
				break;

			}
		}
		if (!found) {
			System.out.println(target + ".......element not found in the array");
		}

	}
}
