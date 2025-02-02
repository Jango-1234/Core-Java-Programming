package Java8;

interface Cab2 {
	public String bookCab(String source, String destination);
}

class Ola implements Cab2 {
	public String bookCab(String source, String destination) {
		System.out.println("Ola cab is booked from" + source + "To" + destination);
		return ("Price: 5000 Rs");
	}
}

public class LambdaExpressionTest3 {

	public static void main(String[] args) {
		// Cab2 cab2 = new Ola();
		Cab2 cab2 = (source, destination) -> {
			System.out.println("Ola cab is booked from " + source +" To "+ destination);
			return ("Price: 5000 Rs");
		};
		cab2.bookCab("Hyd", "Mumbai");

	}

}

//Lambda expression with parameters & return statement