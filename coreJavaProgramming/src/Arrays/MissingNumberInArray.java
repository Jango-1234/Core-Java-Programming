package Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 3 };
		int n = a.length + 1; // Total numbers in the range (1 to n)
		int totalSum = n * (n + 1) / 2; // Sum of numbers from 1 to n
		int arraySum = 0;
		int missingNumber;
		for (int num : a) {
			arraySum += num; // Sum of the numbers in array
		}
		missingNumber = totalSum - arraySum;
		System.out.println(missingNumber);
	}

}
