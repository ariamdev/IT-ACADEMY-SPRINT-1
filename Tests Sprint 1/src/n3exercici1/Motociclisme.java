package n3exercici1;

public class Motociclisme extends Noticies {
	private String equip;

	public Motociclisme(String titular, Redactor redactor, String equip) {
		super(titular, redactor);
		this.equip = equip;
		calcularPuntuacio();
		calcularPreuNoticia();
	}

	public String getEquip() {
		return this.equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}

	@Override
	public void calcularPuntuacio() {
		int puntuacio = 3;
		puntuacio = this.equip.equalsIgnoreCase("Honda") ||
				this.equip.equalsIgnoreCase("Yamaha") ? (puntuacio + 3) : puntuacio;
		setPuntuacio(puntuacio);
	}

	@Override
	public void calcularPreuNoticia() {
		int preu = 100;
		preu = this.equip.equalsIgnoreCase("Honda") ||
				this.equip.equalsIgnoreCase("Yamaha") ? (preu + 50) : preu;
		setPreu(preu);
	}
}
