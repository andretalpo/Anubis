package br.com.andre.anubis.dto;

public class CasoDTO {

	private FichaDTO ficha;
	private ResultadoDTO resultado;

	public CasoDTO(FichaDTO ficha, ResultadoDTO resultado) {
		super();
		this.ficha = ficha;
		this.resultado = resultado;
	}

	public FichaDTO getFicha() {
		return ficha;
	}

	public void setFicha(FichaDTO ficha) {
		this.ficha = ficha;
	}

	public ResultadoDTO getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoDTO resultado) {
		this.resultado = resultado;
	}

}
