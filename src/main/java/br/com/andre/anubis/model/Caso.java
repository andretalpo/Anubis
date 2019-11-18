package br.com.andre.anubis.model;

public class Caso {

	private Ficha ficha;
	private Resultado resultado;

	public Caso(Ficha ficha, Resultado resultado) {
		super();
		this.ficha = ficha;
		this.resultado = resultado;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

}
