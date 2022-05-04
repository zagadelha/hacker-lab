package basketPriceWithDiscounts;

public class Main {

	/**
	 * Entry point of the system
	 */
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Inform at least 1 product to run the program.");
			return;
		}

		BasketPrice basket = new BasketPrice(args);
		basket.calculateSubtotal();
		basket.applyDiscounts();
		basket.print();
	}

}
