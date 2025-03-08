package Strings;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		
		//Approach1
		String str = "Welcome To Java And Selenium";
		String[] words = str.split(" "); // Splitting string into multiple words
		String reverseString = "";
		for (String w : words) {
			String reverseWord = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseWord += w.charAt(i);
			}
			reverseString += reverseWord + " ";
		}
		System.out.println(reverseString); 
		
		//Approach2 : using built-in method
	/*	String str = "Welcome To Java";
		String[] words = str.split("\\s"); //using regex to split
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString()+" ";
		}
		System.out.println(reverseWord); */
	}

}
