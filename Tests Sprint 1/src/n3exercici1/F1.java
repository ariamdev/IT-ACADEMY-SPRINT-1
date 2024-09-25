package n3exercici1;

public class F1 extends Noticies {
	private String escuderia;

	public F1(String titular, Redactor redactor, String escuderia) {
		super(titular, redactor);
		this.escuderia = escuderia;
		calcularPuntuacio();
		calcularPreuNoticia();
	}

	public String getEscuderia() {
		return this.escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	@Override
	public void calcularPuntuacio() {
		int puntuacio = 4;
		puntuacio = this.escuderia.equalsIgnoreCase("Ferrari") ||
				this.escuderia.equalsIgnoreCase("Mercedes") ? (puntuacio + 2) : puntuacio;
		setPuntuacio(puntuacio);
	}

	@Override
	public void calcularPreuNoticia() {
		int preu = 100;
		preu = this.escuderia.equalsIgnoreCase("Ferrari") ||
				this.escuderia.equalsIgnoreCase("Mercedes") ? (preu + 50) : preu;
		setPreu(preu);
	}
}
