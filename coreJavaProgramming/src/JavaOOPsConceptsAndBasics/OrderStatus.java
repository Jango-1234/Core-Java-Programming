package JavaOOPsConceptsAndBasics;

public enum OrderStatus {

	PLACED, ACCEPTED, PREPARING, PICKED, DELIVERED;

	public static void main(String[] args) {

		OrderStatus status = OrderStatus.PREPARING;

		System.out.println("Order status: " + status);

		switch (status) {
		case PLACED -> System.out.println("Order has been placed. Waiting for confirmation.");
		case ACCEPTED -> System.out.println("Order has been accepted by the restaurant.");
		case PREPARING -> System.out.println("Order is being prepared by the restaurant.");
		case PICKED -> System.out.println("Order has been picked up by the delivery driver.");
		case DELIVERED -> System.out.println("Order has been delivered!");
		default -> System.out.println("Unknown order status.");
		}
	}

}
