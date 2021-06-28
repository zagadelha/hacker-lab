package lab.number.roundAndTruncate;

public class MassaTeste {

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
