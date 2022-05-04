package util.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

	private Long id;
	private String description;
	private BigDecimal price;
	private String unit;

	public Product() {
	}

	public Product(Long id) {
		super();
		this.id = id;
	}

	public Product(String description) {
		super();
		this.description = description;
	}

	public Product(Long id, String description, BigDecimal price) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
	}

	public Product(String description, BigDecimal price, String unit) {
		super();
		this.description = description;
		this.price = price;
		this.unit = unit;
	}

	public Product(Long id, String description, BigDecimal price, String unit) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.unit = unit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", description=" + description + ", price=" + price + ", unit=" + unit + "]";
	}

}
