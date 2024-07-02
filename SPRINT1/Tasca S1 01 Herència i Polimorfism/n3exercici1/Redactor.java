package n3exercici1;

public class Redactor {
	//Atributos  (nom, DNI (final), sou (1500)
	
	private String nom;
	private String dni;
	private final int sou = 1500;
	
	public Redactor (String nom, String dni) {
		this.nom = nom;
		this.dni = dni;
	}
	
	public String getNom () {
		return this.nom;
	}
	public String getDni() {
		return this.dni;
	}
	public int getSou() {
		return this.sou;
	}
	
	public void setNom() {
		this.nom = nom;
	}
	public void setDni() {
		this.dni = dni;
	}

	
	
	
	
}
