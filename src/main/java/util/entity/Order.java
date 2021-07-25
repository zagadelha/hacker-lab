package util.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

	private Long id;
	private Person customer;
	private List<Item> items;

	public Order(Long id, Person customer, List<Item> items) {
		super();
		this.id = id;
		this.customer = customer;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getCustomer() {
		return customer;
	}

	public void setCustomer(Person customer) {
		this.customer = customer;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static List<Order> feed() {

		Person c1 = new Person(1, "John");
		Person c2 = new Person(2, "Mary");
		Person c3 = new Person(3, "Peter");

		Product p1 = new Product(1L, "Cellphone", new BigDecimal("200"));
		Product p2 = new Product(2L, "Book", new BigDecimal("10"));
		Product p3 = new Product(3L, "Charger", new BigDecimal("50"));

		Item i1 = new Item(p1, 1L);
		Item i2 = new Item(p2, 2L);
		Item i3 = new Item(p3, 3L);

		List<Item> its1 = feedList(i1, i2, i3);
		List<Item> its2 = feedList(i1, i3);
		List<Item> its3 = feedList(i2, i3);

		Order o1 = new Order(1L, c1, its1);
		Order o2 = new Order(2L, c2, its2);
		Order o3 = new Order(3L, c3, its3);

		List<Order> orders = new ArrayList<Order>();
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);

		return orders;
	}

	private static List<Item> feedList(Item... items) {

		List<Item> itemsReturn = new ArrayList<>();
		Arrays.stream(items).forEach(i -> itemsReturn.add(i));
		return itemsReturn;
	}

}
