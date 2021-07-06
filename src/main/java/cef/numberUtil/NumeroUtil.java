package cef.numberUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumeroUtil {

	private static final Locale BR = new Locale("pt", "BR");
	private static final NumberFormat FORMATO = NumberFormat.getNumberInstance(BR);

	/**
	 * Arredonda um numero BigDecimal recebido com a precisao decimal informada.
	 * 
	 * @param numero   Numero no formato BigDecimal a ser arredondado
	 * @param precisao Quantidade de casas decimais desejada no arredondadamento
	 * @return Numero no formato BigDecimal convertido
	 */
	public static BigDecimal arredondar(BigDecimal numero, int precisao) {

		return numero.setScale(precisao, RoundingMode.HALF_UP);
	}

	/**
	 * Arredonda um numero BigDecimal recebido com a precisao decimal informada,
	 * retornando formatado em String no padrao brasileiro.
	 * 
	 * @param numero   Numero no formato BigDecimal a ser arredondado
	 * @param precisao Quantidade de casas decimais desejada no arredondadamento
	 * @return Numero no formato String convertido
	 */
	public static String arredondarComoString(BigDecimal numero, int precisao) {

		DecimalFormat df = (DecimalFormat) FORMATO;
		df.applyPattern(obterPadrao(precisao));
		numero.setScale(precisao, RoundingMode.HALF_UP);
		return df.format(numero);
	}

	private static String obterPadrao(int precisao) {

		StringBuilder sb = new StringBuilder("#,##0.");

		if (precisao == 0) {
			return "#,##0.00";

		} else {
			for (int i = 0; i < precisao; i++) {
				sb.append("0");
			}
		}
		return sb.toString();
	}

	/**
	 * Trunca um numero BigDecimal recebido com a precisao decimal informada.
	 * 
	 * @param numero   Numero no formato BigDecimal a ser arredondado
	 * @param precisao Quantidade de casas decimais desejada no arredondadamento
	 * @return Numero no formato BigDecimal truncado
	 */
	public static BigDecimal truncar(BigDecimal numero, int precisao) {

		return numero.setScale(precisao, RoundingMode.DOWN);
	}

	/**
	 * Trunca um numero BigDecimal recebido com a precisao decimal informada,
	 * retornando formatado em String no padrao brasileiro.
	 * 
	 * @param numero   Numero no formato BigDecimal a ser arredondado
	 * @param precisao Quantidade de casas decimais desejada no arredondadamento
	 * @return Numero no formato String convertido
	 */
	public static String truncarComoString(BigDecimal numero, int precisao) {

		numero.setScale(precisao, RoundingMode.DOWN);
		return FORMATO.format(numero);
	}

}
