
public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.add(new BagelsOrderItem(0.25, 3));
		cart.add(new BakersDozen(0.35));
			System.out.printf("Total due: $%.02f", cart.totalDue());

	}

} 
