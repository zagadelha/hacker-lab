package lab.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class BigDecimalLocale {

	public static void main(String[] args) {
		String numberString = "2105.88";
		// using casting
		try {
			DecimalFormat df = (DecimalFormat) NumberFormat.getInstance(new Locale("pt", "BR"));
			df.setParseBigDecimal(true);
			BigDecimal bd = (BigDecimal) df.parseObject(numberString);
			System.out.println(bd.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// your way short version
		NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
		try {
			BigDecimal bd1 = new BigDecimal(nf.parse(numberString).toString());
			System.out.println(bd1.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String numberStringFixed = "2105.88";
		// direct string formatted
		System.out.println(new BigDecimal(numberStringFixed));
		// direct but erroneous way if the string is not formatted
		System.out.println(new BigDecimal(numberString));

	}
}