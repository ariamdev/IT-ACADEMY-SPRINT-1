package n3exercici1;

import java.util.ArrayList;

public class Redactor {

	private String nom;
	private final String dni;
	private final int sou = 1500;
	private ArrayList<Noticies> noticies;
	
	public Redactor (String nom, String dni) {
		this.nom = nom;
		this.dni = dni;
		this.noticies = new ArrayList<Noticies>();
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
	public ArrayList<Noticies> getNoticies() {
		return noticies;
	}
	public void setNom() {
		this.nom = nom;
	}

}
