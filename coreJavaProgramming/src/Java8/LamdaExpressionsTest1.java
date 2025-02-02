package Java8;

@FunctionalInterface
interface Cab {
	public void bookCab();
}

/*
 * Instead of this class used lambda expression in main method as below class
 * Ola implements Cab {
 * 
 * public void bookCab() { System.out.println("Ola cab is booked..."); } }
 */

public class LamdaExpressionsTest1 {

	public static void main(String[] args) {

		// Ola cab = new Ola();
		// Cab cab = new Ola();
		Cab cab = () -> System.out.println("Ola cab is booked...");
		cab.bookCab();
	}

}

//Lambda expression with no parameters & no return statement