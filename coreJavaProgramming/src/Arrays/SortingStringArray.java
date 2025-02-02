package Arrays;

import java.util.Arrays;

public class SortingStringArray {

	public static void main(String[] args) {
		// char s[] = {'D','C','B','A'}; // Char Array
		String s[] = { "scott", "Mary", "David", "George" }; // String Array
		System.out.println("Before sorting.." + Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After sorting.." + Arrays.toString(s));

	}

}
