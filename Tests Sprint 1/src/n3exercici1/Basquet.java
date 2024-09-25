package n3exercici1;

	public class Basquet extends Noticies {
	//basquet -competicio(String), club(String) jugador(String)
	
	private String competicio;
	private String club;
	private String jugador;

	public Basquet (String titular, Redactor redactor) {
		super(titular, redactor);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
		calcularPuntuacio();
		calcularPreuNoticia();
	}

		public String getCompeticio() {
			return this.competicio;
		}

		public String getClub() {
			return this.club;
		}

		public String getJugador() {
			return this.jugador;
		}

		public void setCompeticio(String competicio) {
			this.competicio = competicio;
		}

		public void setClub(String club) {
			this.club = club;
		}

		public void setJugador(String jugador) {
			this.jugador = jugador;
		}

		@Override
		public void calcularPreuNoticia() {
			int preu = 250;
			preu = this.competicio.equalsIgnoreCase("Eurolliga") ? (preu+75) : preu;
			preu = this.club.equalsIgnoreCase("Barça") ||
					this.club.equalsIgnoreCase("Madrid") ? (preu + 75) : preu;
			setPreu(preu);

		}

		@Override
		public void calcularPuntuacio() {
		int puntuacio = 4;
		puntuacio = this.competicio.equalsIgnoreCase("Eurolliga") ? (puntuacio +3) : puntuacio;
		puntuacio = this.competicio.equalsIgnoreCase("ACB") ? (puntuacio+2) : puntuacio;
		puntuacio = this.club.equalsIgnoreCase("Barça") ||
				this.club.equalsIgnoreCase("Madrid") ? (puntuacio+1) : puntuacio;
		setPuntuacio(puntuacio);

		}
	}
