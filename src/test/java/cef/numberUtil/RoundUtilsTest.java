package cef.numberUtil;

import java.math.BigDecimal;

public class RoundUtilsTest {

	// Arredondamento de numeros positivos com precisao de 1-10 OK
	// Arredondamento de numeros negativos com precisao de 1-10 OK
	// Arredondamento de numeros positivos com precisao de 29-10 casas decimais OK
	// Arredondamento de numeros negativos com precisao de 29-10 casas decimais OK

//	/**
//	 * Massa de dados de numeros positivos com precisao decimal de 1-10
//	 * 
//	 * Ex: 9,9999999999
//	 * 
//	 * Numeros: Original / Esperado / precisao
//	 * 
//	 * @return double[][] data
//	 */
//	public static double[][] massaNumerosPositivos1e10() {
//		return new double[][] { { 1.9876543210, 2, 0 }, { 1.9876543210, 2.0, 1 }, { 1.9876543210, 1.99, 2 },
//				{ 1.9876543210, 1.988, 3 }, { 1.9876543210, 1.9877, 4 }, { 1.9876543210, 1.98765, 5 },
//				{ 1.9876543210, 1.987654, 6 }, { 1.9876543210, 1.9876543, 7 }, { 1.9876543210, 1.98765432, 8 },
//				{ 1.9876543210, 1.987654321, 9 }, { 1.9876543210, 1.9876543210, 10 }, };
//	}
//
//	@ParameterizedTest
//	@MethodSource(value = "massaNumerosPositivos1e10")
//	void arredondarNumerosPositivos1e10(double[] data) {
//		double num1 = data[0];
//		double expected = data[1];
//		int num2 = (int) data[2];
//		assertEquals(expected, util.arredondar(num1, num2), 0);
//	}
//
//	/**
//	 * Massa de dados de numeros negativos com precisao decimal de 1-10
//	 * 
//	 * Ex: -9,9999999999
//	 * 
//	 * Numeros: Original / Esperado / precisao
//	 * 
//	 * @return double[][] data
//	 */
//	public static double[][] massaNumerosNegativos1e10() {
//		return new double[][] { { -1.9876543210, -2, 0 }, { -1.9876543210, -2.0, 1 }, { -1.9876543210, -1.99, 2 },
//				{ -1.9876543210, -1.988, 3 }, { -1.9876543210, -1.9877, 4 }, { -1.9876543210, -1.98765, 5 },
//				{ -1.9876543210, -1.987654, 6 }, { -1.9876543210, -1.9876543, 7 }, { -1.9876543210, -1.98765432, 8 },
//				{ -1.9876543210, -1.987654321, 9 }, { -1.9876543210, -1.9876543210, 10 }, };
//	}
//
//	@ParameterizedTest
//	@MethodSource(value = "massaNumerosNegativos1e10")
//	void arredondarNumerosNegativos1e10(double[] data) {
//		double num1 = data[0];
//		double expected = data[1];
//		int num2 = (int) data[2];
//		assertEquals(expected, util.arredondar(num1, num2), 0);
//	}
//
//	/**
//	 * Massa de dados de numeros positivos com precisao decimal de 29-10
//	 * 
//	 * Ex: 99999999999999999999999999999,9999999999
//	 * 
//	 * Numeros: Original / Esperado / precisao
//	 * 
//	 * @return double[][] data
//	 */
//	public static double[][] massaNumerosPositivos29e10() {
//		return new double[][] { { 999999999999999.9876543210, 1000000000000000.0000000000, 0 },
//				{ 9999999999999999.876543210, 9999999999999999.9, 1 },
//				{ 9999999999999999.876543210, 9999999999999999.88, 2 },
//				{ 9999999999999999.876543210, 9999999999999999.876, 3 },
//				{ 9999999999999999.876543210, 9999999999999999.8766, 4 },
//				{ 9999999999999999.876543210, 9999999999999999.87654, 5 },
//				{ 9999999999999999.876543210, 9999999999999999.876543, 6 },
//				{ 9999999999999999.876543210, 9999999999999999.8765432, 7 },
//				{ 9999999999999999.876543210, 9999999999999999.87654321, 8 },
//				{ 9999999999999999.876543210, 9999999999999999.876543210, 9 },
//				{ 99999999999999999999999999999.9999999999, 10.9876543210, 10 }, };
//
//	}
//
//	@ParameterizedTest
//	@MethodSource(value = "massaNumerosPositivos29e10")
//	void arredondarNumerosPositivos29e10(double[] data) {
//		double num1 = data[0];
//		double expected = data[1];
//		int num2 = (int) data[2];
//		assertEquals(expected, util.arredondar(num1, num2), 0);
//	}

	/**
	 * Massa de dados de numeros positivos com precisao decimal de 29-10
	 * 
	 * Ex: 99999999999999999999999999999,9999999999
	 * 
	 * Numeros: Original / Esperado / precisao
	 * 
	 * @return double[][] data
	 */
//	public static BigDecimal[][] massaNumerosPositivos29e10() {
//		return new BigDecimal[][] { { new BigDecimal("9999999999999999.876543210"), new BigDecimal("9999999999999999.9"), new BigDecimal("1") },
//				{ new BigDecimal("9999999999999999.876543210"), new BigDecimal("9999999999999999.88"), new BigDecimal("2") },
//				{ new BigDecimal("9999999999999999.876543210"), new BigDecimal("9999999999999999.876"), new BigDecimal("3") },
//				{ new BigDecimal("9999999999999999.876543210"), new BigDecimal("9999999999999999.8766"), new BigDecimal("4") },
//				{ new BigDecimal("9999999999999999.876543210"), new BigDecimal("9999999999999999.87654"), new BigDecimal("5") },
//				{ new BigDecimal("9999999999999999.876543210"), new BigDecimal("9999999999999999.876543"), new BigDecimal("6") },
//				{ new BigDecimal("9999999999999999.876543210"), new BigDecimal("9999999999999999.8765432"), new BigDecimal("7") },
//				{ new BigDecimal("9999999999999999.876543210"), new BigDecimal("9999999999999999.87654321"), new BigDecimal("8") },
//				{ new BigDecimal("9999999999999999.876543210"), new BigDecimal("9999999999999999.876543210"), new BigDecimal("9") },
//				{ new BigDecimal("99999999999999999999999999999.9999999999"), new BigDecimal("10.9876543210"), new BigDecimal("10") }, };
//
//	}
//
//	@ParameterizedTest
//	@MethodSource(value = "massaNumerosPositivos29e10")
//	void arredondarNumerosPositivos29e10(BigDecimal[] data) {
//		BigDecimal num1 = data[0];
//		BigDecimal expected = data[1];
//		int num2 = data[2].intValue();
//		Assert.assertEquals(expected, util.arredondar(num1, num2));
//	}
//
//	@Test
//	@DisplayName("Teste de conversao com precisão máxima (29-10)")
//	void teste() {
//		BigDecimal numero = new BigDecimal("99999999999999999999999999999.9876543210");
//		BigDecimal esperado = new BigDecimal("99999999999999999999999999999.988");
//		int precisao = 3;
//		
//		System.out.println("Numero   : " + NumeroUtil.arredondarComoString(numero, precisao));
//		System.out.println("Esperado : " + NumeroUtil.arredondarComoString(esperado, precisao));
//		
////		Assert.assertEquals(esperado, NumeroUtil.arredondarComoString(numero, precisao));
//		Assert.assertEquals("99.999.999.999.999.999.999.999.999.999,988", NumeroUtil.arredondarComoString(numero, precisao));
//		
//	}

	public static void main(String[] args) {

		// Cenario 1
//		System.out.println("Esperado: 9.0 - Resultado: " + NumeroUtil.arredondar(new BigDecimal("9.04"), 1));

		// Cenario 2
//		System.out.println("Esperado: 9.1 - Resultado: " + NumeroUtil.arredondar(new BigDecimal("9.05"), 1));

		// Cenario 3
//		System.out.println("Esperado: 9.01 - Resultado: " + NumeroUtil.arredondar(new BigDecimal("9.1"), 2));

		// Cenario 4
//		System.out.println("Retorno BigDecimal");
//		System.out.println(NumeroUtil.arredondar(new BigDecimal("123456789.0027579315"), 1));
//		System.out.println(NumeroUtil.arredondar(new BigDecimal("123456789.0027579315"), 2));
//		System.out.println(NumeroUtil.arredondar(new BigDecimal("123456789.0027579315"), 3));
//		System.out.println(NumeroUtil.arredondar(new BigDecimal("123456789.0027579315"), 4));
//		System.out.println(NumeroUtil.arredondar(new BigDecimal("123456789.0027579315"), 5));
//		System.out.println(NumeroUtil.arredondar(new BigDecimal("123456789.0027579315"), 6));
//		System.out.println(NumeroUtil.arredondar(new BigDecimal("123456789.0027579315"), 7));
//		System.out.println(NumeroUtil.arredondar(new BigDecimal("123456789.0027579315"), 8));
//		System.out.println(NumeroUtil.arredondar(new BigDecimal("123456789.0027579315"), 9));
//		System.out.println(NumeroUtil.arredondar(new BigDecimal("123456789.0027579315"), 10));
//		System.out.println(NumeroUtil.arredondar(new BigDecimal("123456789.0027579315"), 11));
//
//		System.out.println("\nRetorno String");
//		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("123456789.0027579315"), 1));
//		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("123456789.0027579315"), 2));
//		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("123456789.0027579315"), 3));
//		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("123456789.0027579315"), 4));
//		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("123456789.0027579315"), 5));
//		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("123456789.0027579315"), 6));
//		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("123456789.0027579315"), 7));
//		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("123456789.0027579315"), 8));
//		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("123456789.0027579315"), 9));
//		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("123456789.0027579315"), 10));
//		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("123456789.0027579315"), 11));

		System.out.println(">>> 31239");
		System.out.println(NumeroUtil.arredondar(new BigDecimal("31239"), 2));
		System.out.println(NumeroUtil.arredondarComoString(new BigDecimal("31239"), 2));

	}

}
