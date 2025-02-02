package JavaCollectionBasics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");

		//Adding all elements from one AL to another AL
		ArrayList<String> al_dup = new ArrayList<String>();
		al_dup.addAll(al);
		System.out.println(al_dup); //[X, Y, Z, A, B, C]
	
		//Removing all elements from one AL
		al_dup.removeAll(al_dup);
		System.out.println("After removing:"+al_dup); //After removing:[]
		
		//Sort an AL -Collections.sort()
		System.out.println("Elements in the array list before sorting:"+al); //Elements in the array list:[X, Y, Z, A, B, C]
		Collections.sort(al);
		System.out.println("Elements in the array list after sorting:"+al); //Elements in the array list after sorting:[A, B, C, X, Y, Z]
		Collections.sort(al,Collections.reverseOrder()); // or Collections.sort(al.reversed())
		System.out.println("Elements in the array list after sorting in reverse order:"+al); //Elements in the array list after sorting in reverse order:[Z, Y, X, C, B, A]
		
		//Shuffling - Collections.shuffle()
		System.out.println("Elements in the array list before shuffling:"+al); //Elements in the array list before shuffling:[Z, Y, X, C, B, A]
		Collections.shuffle(al);
		System.out.println("Elements in the array list after shuffling:"+al); //Elements in the array list after shuffling:[X, Y, B, A, C, Z]
		
	}

}
