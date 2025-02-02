package Java8;

import java.util.function.Predicate;

//Predicate --> can be use when there is one parameter & it returns boolean
// use only if we have conditional checks in the program

public class PredicateTest1 {

	public static void main(String[] args) {
	
		//EX1
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(20)); //true
		System.out.println(p.test(5));  //false
		
		//Ex2 : check the length of given string is greater than 4 or not
		Predicate<String> pr = s->(s.length()>4);
		pr.test("welcome"); //true
		pr.test("Java");  //false
		
		//Ex3: Print array elements whose size is greater than 4
		String names[] = { "David", "Scott", "Smith", "John", "Mary" };
		for (String name : names) {
			if (pr.test(name)) {
				System.out.println(name);
			}

		}
	}

}
