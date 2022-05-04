package basketPriceWithDiscounts;

import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.hamcrest.Matchers;
import org.junit.Test;

public class BasketPriceTest {

	@Test
	public void oneEachProduct() {

		final String[] params = { "Soup", "Bread", "Milk", "Apples" };
		final BasketPrice basket = new BasketPrice(params);
		basket.calculateSubtotal();
		basket.applyDiscounts();
		assertThat(round(basket.getSubtotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(3.75)));
		assertThat(round(basket.getTotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(3.65)));
	}

	@Test
	public void manyEachProduct() {

		final String[] params = { "Soup", "Soup", "Soup", "Bread", "Bread", "Bread", "Milk", "Milk", "Milk", "Apples", "Apples", "Apples" };
		final BasketPrice basket = new BasketPrice(params);
		basket.calculateSubtotal();
		basket.applyDiscounts();
		assertThat(round(basket.getSubtotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(11.25)));
		assertThat(round(basket.getTotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(10.55)));
	}

	@Test
	public void twoSoupAndBread() {

		final String[] params = { "Soup", "Soup", "Bread", "Milk", "Apples" };
		final BasketPrice basket = new BasketPrice(params);
		basket.calculateSubtotal();
		basket.applyDiscounts();
		assertThat(round(basket.getSubtotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(4.40)));
		assertThat(round(basket.getTotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(3.90)));
	}

	@Test
	public void productsNoSoup() {

		final String[] params = { "Bread", "Bread", "Milk", "Milk", "Apples", "Apples" };
		final BasketPrice basket = new BasketPrice(params);
		basket.calculateSubtotal();
		basket.applyDiscounts();
		assertThat(round(basket.getSubtotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(6.20)));
		assertThat(round(basket.getTotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(6.00)));
	}

	@Test
	public void productsNoBread() {

		final String[] params = { "Soup", "Soup", "Soup", "Milk", "Milk", "Milk", "Apples", "Apples", "Apples" };
		final BasketPrice basket = new BasketPrice(params);
		basket.calculateSubtotal();
		basket.applyDiscounts();
		assertThat(round(basket.getSubtotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(8.85)));
		assertThat(round(basket.getTotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(8.55)));
	}

	@Test
	public void productsNoMilk() {

		final String[] params = { "Soup", "Soup", "Bread", "Bread", "Apples", "Apples" };
		final BasketPrice basket = new BasketPrice(params);
		basket.calculateSubtotal();
		basket.applyDiscounts();
		assertThat(round(basket.getSubtotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(4.90)));
		assertThat(round(basket.getTotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(4.30)));
	}

	@Test
	public void productsNoApples() {

		final String[] params = { "Soup", "Soup", "Soup", "Soup", "Bread", "Bread", "Bread", "Bread", "Milk", "Milk", "Milk", "Milk" };
		final BasketPrice basket = new BasketPrice(params);
		basket.calculateSubtotal();
		basket.applyDiscounts();
		assertThat(round(basket.getSubtotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(11.00)));
		assertThat(round(basket.getTotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(10.60)));
	}

	@Test
	public void aproductsNoApples() {

		final String[] params = { "Soup", "Soup", "Soup", "Soup", "Bread", "Bread", "Bread", "Bread", "Milk", "Milk", "Milk", "Milk" };
		final BasketPrice basket = new BasketPrice(params);
		basket.calculateSubtotal();
		basket.applyDiscounts();
		assertThat(round(basket.getSubtotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(11.00)));
		assertThat(round(basket.getTotal(), 2), Matchers.comparesEqualTo(BigDecimal.valueOf(10.60)));
	}

	public static BigDecimal round(BigDecimal number, int precision) {
		return number.setScale(precision, RoundingMode.HALF_UP);
	}

}
