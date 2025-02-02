package Arrays;


import java.util.Arrays;

public class SortingIntergerArray {

	public static void main(String[] args) {
		int a[] = { 100, 200, 500, 300, 600, 400 };
		System.out.println("Array before sorting..");
		System.out.println(Arrays.toString(a)); 
		Arrays.sort(a); //sort elements in an array
		System.out.println("Array after sorting...");
		System.out.println(Arrays.toString(a)); 

	}

}
