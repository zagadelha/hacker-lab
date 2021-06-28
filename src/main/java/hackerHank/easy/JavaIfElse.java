package hackerHank.easy;

import java.util.Scanner;

public class JavaIfElse {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (N >= 1 && N <= 100) { // numero permitido
			if ((N % 2) != 0) { // numero impar
				System.out.println("Weird");
			} else { // numero par
				if (N >= 2 && N <= 5) {
					System.out.println("Not Weird");
				} else if (N >= 6 && N <= 20) {
					System.out.println("Weird");
				} else {
					System.out.println("Not Weird");
				}
			}
		} else {
			throw new IllegalArgumentException("Numero informado invalido!");
		}
		scanner.close();
	}

}
