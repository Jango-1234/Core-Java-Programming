package Arrays;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i]; // Element to be placed
			int j = i - 1;
			
		 // Shift elements that are greater than key
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;// Insert key at correct position
		}

	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 6, 2 };
		System.out.println("Array before sorting:" + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Array after sorting:" + Arrays.toString(arr));
	}

}
