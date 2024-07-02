package n3exercici1;

public class Noticies {
	//-Atributos: titular, text (vacio), puntuacio, preu.
	//-Métodos: calcularPreuNoticia() / calcularPuntuacio()
	
	String titular;
	String text = "";
	int puntuacio;
	int preu;
	
	public Noticies (String titular, String text, int puntuacio, int preu) {
		this.titular = titular;
		this.text = text;
		this.puntuacio = puntuacio;
		this.preu = preu;
	}
	
	public String getTitular() {
		return this.titular;
	}
	public String getText() {
		return this.text;
	}
	public int getPuntuacio() {
		return this.puntuacio;
	}
	public int getPreu() {
		return this.preu;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setText (String text) {
		this.text = text;
	}
	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}
	public void setPreu(int preu) {
		this.preu = preu;
	}

	public void calcularPreuNoticia() {
		
	}
}
