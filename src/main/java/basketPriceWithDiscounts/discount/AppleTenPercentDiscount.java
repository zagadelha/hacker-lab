package basketPriceWithDiscounts.discount;

import java.math.BigDecimal;
import java.util.List;

import util.entity.Item;

public class AppleTenPercentDiscount extends DiscountDecorator {

	public static final BigDecimal TEN = new BigDecimal(10);
	public static final BigDecimal ONE_HUNDRED = new BigDecimal(100);
	private static final String DESCRIPTION = "Apples have 10% off their normal price this week";

	public AppleTenPercentDiscount(Discount discount) {
		super(discount, DESCRIPTION);
	}

	@Override
	public BigDecimal apply(List<Item> items) {

		BigDecimal discountedPrice = super.apply(items);
		BigDecimal percentageDiscount = new BigDecimal(0);

		for (Item item : items) {
			if (item.getProduct().getId() == 4) {
				percentageDiscount = TEN.divide(ONE_HUNDRED);
				discountedPrice = item.getAmount().multiply(percentageDiscount);
			}
		}
		return discountedPrice;
	}

}
