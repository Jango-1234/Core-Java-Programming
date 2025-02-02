package Strings;

public class StringManipulation {

	public static void main(String[] args) {
	String str = "The rains have started here";
	
	String str1 = "The rains Have started here";
	
	System.out.println(str.length()); // Returns the length of the string
	
	System.out.println(str.charAt(5)); // Returns the character value at specific index
	
	System.out.println(str.indexOf('s')); // Returns 1st occurence of S
	System.out.println(str.indexOf('s', (str.indexOf('s')+1))); // Returns 2nd occurence of s
	
	System.out.println(str.indexOf("have")); // Returns the index of string have
	
	System.out.println(str.indexOf("hello")); // Returns -1 as the string is not present
	
	System.out.println(str.equals(str1)); // compares 2 strings and returns true or false
	
	System.out.println(str.equalsIgnoreCase(str1)); // compares 2 strings without considering the case sensitiveness
	
	System.out.println(str.substring(0, 9)); // Returns a portion of string excluding end index
	
	String s = "  Good Morning ";
	System.out.println(s.trim()); // Removes before & after space but not middle space
	System.out.println(s.replace(" ", "")); // Removes middle space as well
	
	String date = "01-01-2024";
	System.out.println(date.replace("-", "/")); // Replace - with / in date 01/01/2024
	
	String test = "Hellow_World_Test_Selenium";
	String testval[]= test.split("_");// Returns an array with 4 values by splitting with _
	for (int i = 0; i < testval.length; i++) {
		System.out.println(testval[i]);
	}
	
	String s2 = "cares";
	System.out.println(s2.concat(s)); // Joins two strings
	
	String x = "Hello"; // very important printing outputs
	String y = "World";
	int a=100;
	int b=200;
	System.out.println(x+y); //HelloWorld
	System.out.println(a+b); //300
	System.out.println(x+y+a+b); //HelloWorld100200
	System.out.println(a+b+x+y); //300HelloWorld
	System.out.println((x+y)+a+b); //HelloWorld100200
	
	
	
	}

}
