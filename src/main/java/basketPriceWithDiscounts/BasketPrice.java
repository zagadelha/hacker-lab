package basketPriceWithDiscounts;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import basketPriceWithDiscounts.discount.AppleTenPercentDiscount;
import basketPriceWithDiscounts.discount.DiscountDecorator;
import basketPriceWithDiscounts.discount.TwoSoupGetBreadDiscount;
import util.entity.Item;
import util.entity.Product;

public class BasketPrice {

	private static List<Product> stock = new ArrayList<Product>();
	private static List<DiscountDecorator> discounts = new ArrayList<DiscountDecorator>();
	private List<Item> items = new ArrayList<Item>();
	private BigDecimal subtotal;
	private BigDecimal total;

	/**
	 * Instructions to be executed on the beginning of the program
	 */
	static {

		// Load the available products on stock
		stock.add(new Product(1L, "Soup", new BigDecimal(0.65), "per tin"));
		stock.add(new Product(2L, "Bread", new BigDecimal(0.80), "per loaf"));
		stock.add(new Product(3L, "Milk", new BigDecimal(1.30), "per bottle"));
		stock.add(new Product(4L, "Apples", new BigDecimal(1.00), "per bag"));

		// Load current special offers
		AppleTenPercentDiscount appleDiscount = new AppleTenPercentDiscount(null);
		TwoSoupGetBreadDiscount breadDiscount = new TwoSoupGetBreadDiscount(appleDiscount);
		discounts.add(appleDiscount);
		discounts.add(breadDiscount);
	}

	/**
	 * Set informed products as parameters on a list
	 */
	public BasketPrice(String[] productsAsParam) {

		for (String product : productsAsParam) {
			int position = availableInStock(product);
			if (position >= 0) {
				// aggregate the products items
				Product p = stock.get(position);
				position = items.indexOf(new Item(p));
				if (position >= 0) {
					// exists -> increment ++
					items.get(position).increment();
				} else {
					// not exists 1
					items.add(new Item(p, 1L));
				}
			}
		}
	}

	/**
	 * Check if mentioned product exists in stock and return its position on list
	 */
	private int availableInStock(String product) {

		Product p;
		List<Product> result = stock.stream().filter(item -> item.getDescription().equals(product)).collect(Collectors.toList());
		if (result.size() > 0) {
			p = result.get(0);
			return stock.indexOf(p);
		}
		return -1;
	}

	/**
	 * Calculate the sum of all items on list
	 */
	public void calculateSubtotal() {

		BigDecimal subtotal = new BigDecimal(0);
		for (Item item : items) {
			BigDecimal quantity = new BigDecimal(item.getQuantity());
			BigDecimal sum = quantity.multiply(item.getProduct().getPrice());
			subtotal = subtotal.add(sum);
		}
		this.subtotal = subtotal;
	}

	/**
	 * Apply the current discounts at sub-total
	 */
	public void applyDiscounts() {

		AppleTenPercentDiscount appleDiscount = new AppleTenPercentDiscount(null);
		TwoSoupGetBreadDiscount breadDiscount = new TwoSoupGetBreadDiscount(appleDiscount);
		BigDecimal discountPrice = breadDiscount.apply(items);
		this.total = this.subtotal.subtract(discountPrice);
	}

	/**
	 * Prints the desired informations: Sub-total, applied discounts and total
	 */
	public void print() {
		System.out.println("Subtotal: " + asCurrency(subtotal));
		printDiscounts();
		System.out.println("Total: " + asCurrency(total));
	}

	private static void printDiscounts() {
		for (DiscountDecorator d : discounts) {
			System.out.println(d.getDescrition());
		}
	}

	static public String asCurrency(BigDecimal amount) {

		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.UK);
		return currencyFormatter.format(amount);
	}

	public static List<Product> getStock() {
		return stock;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
