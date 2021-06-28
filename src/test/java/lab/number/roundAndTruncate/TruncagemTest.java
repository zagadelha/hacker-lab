package lab.number.roundAndTruncate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import lab.number.NumeroUtil;

public class TruncagemTest {

	/**
	 * Massa de testes para Truncagem
	 */
	public static List<MassaTeste> getMassaTruncagem() {

		List<MassaTeste> massa = new ArrayList<MassaTeste>();

		// Positivos com precisao de 29-10 (Inteiros-Decimais)
		String numeroConverter = "99999999999999999999999999999.9876543210";
		massa.add(new MassaTeste(numeroConverter, "99999999999999999999999999999.9", 1));
		massa.add(new MassaTeste(numeroConverter, "99999999999999999999999999999.98", 2));
		massa.add(new MassaTeste(numeroConverter, "99999999999999999999999999999.987", 3));
		massa.add(new MassaTeste(numeroConverter, "99999999999999999999999999999.9876", 4));
		massa.add(new MassaTeste(numeroConverter, "99999999999999999999999999999.98765", 5));
		massa.add(new MassaTeste(numeroConverter, "99999999999999999999999999999.987654", 6));
		massa.add(new MassaTeste(numeroConverter, "99999999999999999999999999999.9876543", 7));
		massa.add(new MassaTeste(numeroConverter, "99999999999999999999999999999.98765432", 8));
		massa.add(new MassaTeste(numeroConverter, "99999999999999999999999999999.987654321", 9));
		massa.add(new MassaTeste(numeroConverter, "99999999999999999999999999999.9876543210", 10));

		// Negativos com precisao de 29-10 (Inteiros-Decimais)
		numeroConverter = "-99999999999999999999999999999.9876543210";
		massa.add(new MassaTeste(numeroConverter, "-99999999999999999999999999999.9", 1));
		massa.add(new MassaTeste(numeroConverter, "-99999999999999999999999999999.98", 2));
		massa.add(new MassaTeste(numeroConverter, "-99999999999999999999999999999.987", 3));
		massa.add(new MassaTeste(numeroConverter, "-99999999999999999999999999999.9876", 4));
		massa.add(new MassaTeste(numeroConverter, "-99999999999999999999999999999.98765", 5));
		massa.add(new MassaTeste(numeroConverter, "-99999999999999999999999999999.987654", 6));
		massa.add(new MassaTeste(numeroConverter, "-99999999999999999999999999999.9876543", 7));
		massa.add(new MassaTeste(numeroConverter, "-99999999999999999999999999999.98765432", 8));
		massa.add(new MassaTeste(numeroConverter, "-99999999999999999999999999999.987654321", 9));
		massa.add(new MassaTeste(numeroConverter, "-99999999999999999999999999999.9876543210", 10));

		// Positivos com precisao de 1-10 (Inteiros-Decimais)
		numeroConverter = "9.9876543210";
		massa.add(new MassaTeste(numeroConverter, "9.9", 1));
		massa.add(new MassaTeste(numeroConverter, "9.98", 2));
		massa.add(new MassaTeste(numeroConverter, "9.987", 3));
		massa.add(new MassaTeste(numeroConverter, "9.9876", 4));
		massa.add(new MassaTeste(numeroConverter, "9.98765", 5));
		massa.add(new MassaTeste(numeroConverter, "9.987654", 6));
		massa.add(new MassaTeste(numeroConverter, "9.9876543", 7));
		massa.add(new MassaTeste(numeroConverter, "9.98765432", 8));
		massa.add(new MassaTeste(numeroConverter, "9.987654321", 9));
		massa.add(new MassaTeste(numeroConverter, "9.9876543210", 10));

		// Negativos com precisao de 1-10 (Inteiros-Decimais)
		numeroConverter = "-9.9876543210";
		massa.add(new MassaTeste(numeroConverter, "-9.9", 1));
		massa.add(new MassaTeste(numeroConverter, "-9.98", 2));
		massa.add(new MassaTeste(numeroConverter, "-9.987", 3));
		massa.add(new MassaTeste(numeroConverter, "-9.9876", 4));
		massa.add(new MassaTeste(numeroConverter, "-9.98765", 5));
		massa.add(new MassaTeste(numeroConverter, "-9.987654", 6));
		massa.add(new MassaTeste(numeroConverter, "-9.9876543", 7));
		massa.add(new MassaTeste(numeroConverter, "-9.98765432", 8));
		massa.add(new MassaTeste(numeroConverter, "-9.987654321", 9));
		massa.add(new MassaTeste(numeroConverter, "-9.9876543210", 10));

		return massa;
	}

	@Test
	public void testeTruncagem() {

		int i = 1;
		for (MassaTeste massa : getMassaTruncagem()) {

			BigDecimal numero = new BigDecimal(massa.getNumero());
			BigDecimal esperado = new BigDecimal(massa.getEsperado());
			int precisao = massa.getPrecisao();
			System.out.println(i++);
			Assert.assertEquals(esperado, NumeroUtil.truncar(numero, precisao));
		}
	}

}
