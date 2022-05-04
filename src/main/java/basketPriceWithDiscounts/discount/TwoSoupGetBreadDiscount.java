package basketPriceWithDiscounts.discount;

import java.math.BigDecimal;
import java.util.List;

import util.entity.Item;

public class TwoSoupGetBreadDiscount extends DiscountDecorator {

	private static final BigDecimal FIFTY = new BigDecimal(50);
	private static final BigDecimal ONE_HUNDRED = new BigDecimal(100);
	private static final String DESCRIPTION = "Buy 2 tins of soup and get a loaf of bread for half price";

	public TwoSoupGetBreadDiscount(Discount discount) {
		super(discount, DESCRIPTION);
	}

	@Override
	public BigDecimal apply(List<Item> items) {

		BigDecimal discountedPrice = super.apply(items);
		BigDecimal percentageDiscount = new BigDecimal(0);
		boolean oneBreadDiscount = true;

		// apply only if has more than 2 tins of soup
		if (productHasMoreThan(1L, 1, items)) {
			for (Item item : items) {
				if (item.getProduct().getId() == 2) {
					// apply 50% discount at 1 bread
					if (oneBreadDiscount) {
						percentageDiscount = FIFTY.divide(ONE_HUNDRED);
						discountedPrice = discountedPrice.add(item.getProduct().getPrice().multiply(percentageDiscount));
						oneBreadDiscount = false;
					}
				}
			}
		}
		return discountedPrice;
	}

}
