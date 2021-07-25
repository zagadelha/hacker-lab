package lab.streams;

import java.math.BigDecimal;
import java.util.List;

import util.entity.Item;
import util.entity.Order;

public class StreamNestedForeach {

	public static void main(String[] args) {

		BigDecimal totalSales = BigDecimal.ZERO;
		List<Order> orders = Order.feed();

		System.out.println("LISTING ALL ORDERS...");
		orders.forEach(order -> {
			order.getItems().forEach(item -> {
				printItem(item);
				totalSales.add(item.getProduct().getPrice().multiply(BigDecimal.valueOf(item.getQuantity())));
			});
		});
		System.out.println("----------------------------------------");
		System.out.println("TOTAL SALES: " + totalSales);
	}

	private static void printItem(Item item) {

		System.out.println("----------------------------------------");
		System.out.println("Product: " + item.getProduct().getDescription());
		System.out.println("Price: " + item.getProduct().getPrice());
		System.out.println("Quantity: " + item.getQuantity());
		System.out.println("Sub-Total: " + item.getProduct().getPrice().multiply(new BigDecimal(item.getQuantity())));
	}

}
