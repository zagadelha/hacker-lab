package util.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {

	private Product product;
	private Long quantity;

	public Item(Product product) {
		super();
		this.product = product;
	}

	public Item(Product product, Long quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public BigDecimal getAmount() {
		return new BigDecimal(quantity).multiply(product.getPrice());
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	/**
	 * Increment +1 to quantity field
	 */
	public void increment() {
		this.quantity++;
	}

	@Override
	public int hashCode() {
		return Objects.hash(product.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(product.getId(), other.product.getId());
	}

}
