package n3exercici1;

public class Tenis extends  Noticies{
	//tenis- competicio(String) tenistes(String)
	private String competicio;
	private String tenistes;

	public Tenis(String titular, Redactor redactor, String competicio, String tenistes) {
		super(titular, redactor);
		this.competicio = competicio;
		this.tenistes = tenistes;
		calcularPuntuacio();
		calcularPreuNoticia();
	}

	public String getCompeticio() {
		return this.competicio;
	}

	public String getTenistes() {
		return this.tenistes;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public void setTenistes(String tenistes) {
		this.tenistes = tenistes;
	}

	@Override
	public void calcularPreuNoticia() {
		int preu = 150;
		preu = this.tenistes.equalsIgnoreCase("Federer") ||
				this.tenistes.equalsIgnoreCase("Nadal") ||
				this.tenistes.equalsIgnoreCase("Djokovic") ? (preu + 100) : preu;
		setPreu(preu);
	}

	@Override
	public void calcularPuntuacio() {
		int puntuacio = 4;
		puntuacio = this.tenistes.equalsIgnoreCase("Federer") ||
				this.tenistes.equalsIgnoreCase("Nadal") ||
				this.tenistes.equalsIgnoreCase("Djokovic") ? (puntuacio + 3) : puntuacio;
		setPuntuacio(puntuacio);
	}
}
