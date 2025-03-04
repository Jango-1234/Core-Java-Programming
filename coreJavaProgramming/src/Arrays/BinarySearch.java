package Arrays;

public class BinarySearch {

	public static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (array[mid] == target) {
				return mid; // Target found
			} else if (array[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1; // Target not found
	}

	public static void main(String[] args) {
		int[] sortedArray = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		int targetValue = 23;

		int result = binarySearch(sortedArray, targetValue);

		if (result == -1) {
			System.out.println("Element not present in array");
		} else {
			System.out.println("Element found at index " + result);
		}

	}

}
