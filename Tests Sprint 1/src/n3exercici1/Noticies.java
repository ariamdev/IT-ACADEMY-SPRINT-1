package n3exercici1;

public abstract class Noticies {

	private Redactor redactor;
	private String titular;
	private String text = "";
	private int puntuacio;
	private int preu;



	public Noticies (String titular, Redactor redactor) {
		this.titular = titular;
		this.text = "";
		this.redactor = redactor;
		this.puntuacio = 0;
		this.preu = 0;
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
	public Redactor getRedactor() {
		return this.redactor;
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
	public void setRedactor(Redactor redactor){
		this.redactor = redactor;
	}


    public abstract void calcularPreuNoticia();

    public abstract void calcularPuntuacio();
}
