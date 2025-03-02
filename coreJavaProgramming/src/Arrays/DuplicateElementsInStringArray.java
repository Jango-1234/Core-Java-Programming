package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInStringArray {

	public static void main(String[] args) {
		String names[] = { "Java", "JavaScript", "Ruby", "C", "Python", "Java","C" };

		// Approach1 --> Time complexity = O(nxn)
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate element is:" + names[i]);
				}

			}

		}
		
		System.out.println("*************");
		
		//Approach2 ---> Timecomplexity is O(n)
		Set<String> store = new HashSet<String>(); //HashSet ensures that each element is stored only once. This is crucial for identifying duplicates.
		for (String name : names) {
			if (store.add(name)== false) {
				System.out.println("Duplicate element is:" +name);
			}
		}
	}

}
