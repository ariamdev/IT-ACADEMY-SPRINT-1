package n3exercici1;

public class Cine {

    private int filesCinema;
    private int seientsFila;
    private GestioButaques gestioButaques;

    public Cine() {
        //GestioButaques gestioButaques1 = new GestioButaques();
        //Crearà l’objecte de la classe GestióButaques.
        // I cridarà al mètode demanarDadesInicials que inicialitzarà el nombre de files i de seients.
    }

    public void iniciar(){
        //iniciar: començarà l’aplicació.
        // Cridarà al mètode menu i en funció del número retornat, cridarà al mètode corresponent.
    }

    public void menu(){
        //menu: mostrarà les opcions del menú principal a l’usuari/ària,
        // li demanarà el número de l’opció escollida i el retornarà.
    }

    public void mostrarButaques(){
        //mostrarButaques: Mostra totes les butaques reservades.
    }

    public void mostrarButaquesPersona(){
        //mostrarButaquesPersona: Demana el nom de la persona que ha fet la reserva
        // i mostra totes les butaques reservades per aquesta persona.
    }

    public void reservarButaca(){
        //reservarButaca: Demana a l’usuari/ària un número de fila (crida al mètode introduirFila)
        // un número de seient (crida al mètode introduirSeient), el nom de la persona que fa
        // la reserva (crida al mètode introduirPersona) i reserva la butaca.
    }

    public void anularReserva(){
        //anularReserva: Demana a l’usuari/ària un número de fila (crida al mètode introduirFila),
        // un número de seient (crida al mètode introduirSeient) i elimina la reserva de la butaca.
    }

    public void anularReservaPersona(){
        //anularReservaPersona: Demana a l’usuari/ària el nom de la persona
        // (crida al mètode introduirPersona) i elimina les butaques reservades per la persona introduïda.
    }

    public void introduirPersona(){
        //introduirPersona: demana a l’usuari/ària el nom de la persona i el retorna si és correcte.
        // Si conté números, llença una excepció personalitzada ExcepcioNomPersonaIncorrecte.
    }
    public void demanarDadesInicials(){
        //demanarDadesInicials: Demana a l’usuari/ària el nombre de files i seients
        // i els guarda en els atributs corresponents.
    }
    public void introduirFila() {
        //ntroduirFila: Demana el nombre de fila, si aquest està entre 1 i
        // el nombre de files totals, el retorna. Si no, retorna una excepció personalitzada ExcepcioFilaIncorrecta.
    }
    public void introduirSeient(){
        //introduirSeient: Demana el seient, si el número està entre 1 i el nombre total de seients,
        // el retorna. Si no, retorna una excepció del tipus ExcepcioSeientIncorrecte.
    }
}
