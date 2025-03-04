package Arrays;

public class LinearSearch {

	public static int linearSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i; // Target found at index i
			}
		}
		return -1; // Target not found
	}

	public static void main(String[] args) {

		int[] myArray = { 10, 25, 5, 30, 15 };
		int targetValue = 30;

		int result = linearSearch(myArray, targetValue);

		if (result == -1) {
			System.out.println("Element not present in array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}
