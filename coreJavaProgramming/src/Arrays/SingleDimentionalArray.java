package Arrays;

public class SingleDimentionalArray {

	public static void main(String[] args) {

		// Declaring an Array
		// Approach1
		int a[] = new int[5]; // if Size is known i.e. 5

		// Storing Assigning data in Array
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;

		// Approach2
		int a1[] = { 100, 200, 300, 400, 500 }; // if size is unknown

		// length of an array
		System.out.println("Length of an array:" + a1.length); // Length of an array:5

		// read single value from an array
		System.out.println("Value of an array at index2:" + a[3]); // Value of an array at index2:400

		// Read all elements from an array using traditional for loop
		System.out.println("Reading all elements from an array using traditional for loop");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		/*
		 * Reading all elements from an array using traditional for loop 100 200 300 400
		 * 500
		 */

		// Read all elements from an array using for each loop
		System.out.println("Reading all elements from an array using for each loop");
		for (int i : a) {
			System.out.println(i);
		}
	}

}
