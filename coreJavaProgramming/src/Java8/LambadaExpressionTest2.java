package Java8;


interface Cab1 {
	public void bookCab(String source, String destination);
}

/*
 * class Ola implements Cab1 { public void bookCab(String source, String
 * destination) {
 * System.out.println("Ola cab is booked from"+source+"To"+destination); } }
 */

public class LambadaExpressionTest2 {

	public static void main(String[] args) {
		//Cab1 cab1 = new Ola();
		Cab1 cab1 = (source,destination)->System.out.println("Ola cab is booked from " + source + " To " + destination);
		cab1.bookCab("Hyd", "Mumbai");

	}

}

//Lambda expression with parameters & no return statement