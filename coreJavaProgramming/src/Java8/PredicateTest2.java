package Java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	int experience;

	Employee(String name, int sal, int exp) {
		ename = name;
		salary = sal;
		experience = exp;
	}
}

public class PredicateTest2 {

	public static void main(String[] args) {
		Employee emp = new Employee("John", 50000, 5);
		//Ex1 : emp obj --> return name if sal>30k exp>3
		Predicate<Employee> pr = e -> (e.salary > 30000 && e.experience > 3);
		//System.out.println(pr.test(emp));

		//Ex2: 
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("John", 50000, 5));
		al.add(new Employee("David", 20000, 2));
		al.add(new Employee("Scott", 30000, 3));
		al.add(new Employee("Smith", 40000, 6));
		
		for (Employee e : al) {
			if(pr.test(e)) {
				System.out.println(e.ename+" "+e.salary+" "+e.experience);
			}
			
		}
	}

}
