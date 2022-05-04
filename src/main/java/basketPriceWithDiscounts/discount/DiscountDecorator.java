package basketPriceWithDiscounts.discount;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import util.entity.Item;

public class DiscountDecorator implements Discount {

	protected Discount discount;
	private String descrition;

	public DiscountDecorator(Discount discount, String descrition) {
		super();
		this.discount = discount;
		this.descrition = descrition;
	}

	@Override
	public BigDecimal apply(List<Item> items) {

		if (Objects.nonNull(discount)) {
			return discount.apply(items);
		}
		return new BigDecimal(0);
	}

	/**
	 * Check if there are more than 1 tin of soup on basket
	 */
	public boolean productHasMoreThan(Long productId, int quantity, List<Item> items) {

		List<Item> result = items.stream().filter(item -> item.getProduct().getId().equals(productId)).filter(item -> item.getQuantity() > quantity).collect(Collectors.toList());
		if (Objects.nonNull(result) && result.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public String getDescrition() {
		return descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

}