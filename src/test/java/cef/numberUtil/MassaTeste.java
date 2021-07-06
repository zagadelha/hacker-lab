package cef.numberUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MassaTeste {

	private static final Locale BR = new Locale("pt", "BR");
	private static final NumberFormat FORMATO = NumberFormat.getNumberInstance(BR);

	private String numero;
	private String esperado;
	private int precisao;

	public MassaTeste(String numero, String esperado, int precisao) {
		super();
		this.numero = numero;
		this.esperado = esperado;
		this.precisao = precisao;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEsperado() {
		return esperado;
	}

	public String getEsperadoArredondadoComoString() {

		DecimalFormat df = (DecimalFormat) FORMATO;
		df.applyPattern(obterPadrao(precisao));

		BigDecimal newNumber = new BigDecimal(this.numero);
		newNumber.setScale(this.precisao, RoundingMode.HALF_UP);
		return df.format(newNumber);
	}

	public String getEsperadoTruncadoComoString() {

		BigDecimal newNumber = new BigDecimal(this.numero);
		newNumber.setScale(precisao, RoundingMode.DOWN);
		return FORMATO.format(newNumber);
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

	public void setEsperado(String esperado) {
		this.esperado = esperado;
	}

	public int getPrecisao() {
		return precisao;
	}

	public void setPrecisao(int precisao) {
		this.precisao = precisao;
	}

}
