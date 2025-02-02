package JavaCollectionBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//Declare ArrayList
		//ArrayList al = new ArrayList();
		ArrayList<Object> al = new ArrayList<>();
		
		//Add new elements to the ArrayList
		al.add(100);
		al.add("welcome");
		al.add("15.5");
		al.add('A');
		al.add(true);
		
		System.out.println(al); //[100, welcome, 15.5, A, true]
		
		//size
		System.out.println("Number of elements in the array list:"+ al.size()); //Number of elements in the array list:5
		
		//remove
		al.remove(1); // here 1 is the index
		System.out.println("After removing element from the array list:"+ al); //After removing element from the array list:[100, 15.5, A, true]
		
		//insert a new element
		//add(index, object) -syntax
		al.add(2,"Python");
		System.out.println("After insertion:"+al); //After insertion:[100, 15.5, Python, A, true]
		
		//Retrieve a specific element
		System.out.println(al.get(2));// Python , here 2 is the index of element
		
		
		//Change element or replace
		al.set(2,  "C#");
		System.out.println("After replacing with the new element:"+al); //After replacing with the new element:[100, 15.5, C#, A, true]
		
		//search - contains() - returns either true or false
		System.out.println(al.contains("Python")); //false
		System.out.println(al.contains("C#")); //true
		
		//isEmpty()
		System.out.println(al.isEmpty()); //false
		
		// for loop traditional
		System.out.println("Reading elements using traditional for loop");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		/*
		 * Reading elements using traditional for loop 100 15.5 C# A true
		 */

		//for each loop
		System.out.println("Reading elements using for each loop");
		for (Object e : al) {
			System.out.println(e);
		}
		/*
		 * Reading elements using for each loop 100 15.5 C# A true
		 */
		
		// iterator
		System.out.println("Reading elements using iterator method");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); // printing the element and move to next
			
		}
		/*
		 * Reading elements using iterator method 100 15.5 C# A true
		 */
		
	
	}

}

