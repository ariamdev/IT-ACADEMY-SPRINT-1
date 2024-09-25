package n3exercici1;

public class Futbol extends Noticies {
	//futbol -competicion(String), club(String), jugador(String)

	private String competicio;
	private String club;
	private String jugador;


	public Futbol(String titular, Redactor redactor, String competicio,String club, String jugador) {
		super(titular, redactor);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
		calcularPuntuacio();
		calcularPreuNoticia();
	}

	public String getCompeticio(){
		return this.competicio;
	}
	public String getClub (){
		return this.club;
	}
	public String getJugador(){
		return this.jugador;
	}

	public void setCompeticio(String competicio){
		this.competicio = competicio;
	}
	public void setClub(String club){
		this.club = club;
	}
	public void setJugador(String jugador){
		this.jugador = jugador;
	}


	@Override
	public void calcularPreuNoticia() {
		int preu = 300;
		preu = this.competicio.equalsIgnoreCase("Lliga de Campions") ? (preu + 100) : preu;
		preu = this.club.equalsIgnoreCase("Barça") ||
				this.club.equalsIgnoreCase("Madrid") ? (preu + 100) : preu;
		preu = this.jugador.equalsIgnoreCase("Ferran Torres") ||
				this.jugador.equalsIgnoreCase("Benzema") ? (preu + 50) : preu;

		setPreu(preu);

	}

	@Override
	public void calcularPuntuacio() {
		int puntuacio = 5;
		puntuacio = this.competicio.equalsIgnoreCase("Lliga de campions") ? (puntuacio + 3) : puntuacio;
		puntuacio = this.competicio.equalsIgnoreCase("Lliga") ? (puntuacio + 2) : puntuacio;
		puntuacio = this.club.equalsIgnoreCase("Barça") ||
				this.club.equalsIgnoreCase("Madrid") ? (puntuacio + 1) : puntuacio;
		puntuacio = this.jugador.equalsIgnoreCase("Ferran Torres") ||
				this.jugador.equalsIgnoreCase("Benzema") ? (puntuacio + 1 ) : puntuacio;
		setPuntuacio(puntuacio);
	}
}
