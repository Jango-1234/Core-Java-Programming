package JavaCollectionBasics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	LinkedList<String> ll = new LinkedList<String>();
	
	//add()
	ll.add("test");
	ll.add("qtp");
	ll.add("selenium");
	ll.add("RPA");
	ll.add("RFT");
	
	//print
	System.out.println("content of linkedlist:"+ ll);
	
	//addFirst()
	ll.addFirst("software");
	//addLast()
	ll.addLast("engineer");
	System.out.println("content of linkedlist:"+ ll);
	
	//get()
	System.out.println(ll.get(0));
	//set()
	ll.set(0, "Tom");
	System.out.println(ll.get(0));
	
	//removeFirst() and removeLast()
	ll.removeFirst();
	ll.removeLast();
	System.out.println("content of linkedlist:"+ ll);
	
	ll.remove(2);
	System.out.println("content of linkedlist:"+ ll);
	
	//print all values in LinkedList
	
	//for loop
	System.out.println("using for loop");
	for (int i = 0; i < ll.size(); i++) {
		System.out.println(ll.get(i));
	}
	
	//for each loop
	System.out.println("using for each loop");
	for (String str : ll) {
		System.out.println(str);
	}
	
	//Iterator
	System.out.println("using Iterator");
	Iterator<String>it=ll.iterator();
	while (it.hasNext()) {
		 System.out.println(it.next());
		
	}
	
	//while loop
	System.out.println("using while loop");
	int num = 0;
	while (ll.size()>num) {
		System.out.println(ll.get(num));
		num++;
	}
	
	}

}
