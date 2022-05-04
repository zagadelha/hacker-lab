package basketPriceWithDiscounts.discount;

import java.math.BigDecimal;
import java.util.List;

import util.entity.Item;

public interface Discount {

	BigDecimal apply(List<Item> items);

}
