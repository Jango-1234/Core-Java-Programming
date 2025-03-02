package JavaCollectionBasics;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcept1 {

	public static void main(String[] args) {
		//Hashmap i a class implements Map interface
		//extends AbstractMap
		//It contains only unique keys
		//stores the values -> Keys-value pair
		//It may have have one null value and multipe null values
		//it maintains no order
		//HashMap is non-synchronised -> Not thread safe
		//Concurrent modification exception -> fail fast condition
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
 
	}

}
