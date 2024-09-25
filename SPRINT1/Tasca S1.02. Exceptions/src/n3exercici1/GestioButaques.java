package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class GestioButaques {

    private ArrayList<Butaca> butaques;

    public GestioButaques(ArrayList<Butaca> butaques) {
        this.butaques = new ArrayList<Butaca>();
    }

    public ArrayList<Butaca> getButaques() {
        return butaques;
    }

    public void afegirButaca(Butaca butaca){
        this.butaques.add(butaca);

        //Si la fila i el seient de la butaca rebuda com a paràmetre coincideixen
        // amb el d’una butaca que ja es trobi a l’ArrayList (s’utilitzarà el mètode cercarButaca),
        // es llençarà l’excepció personalitzada ExcepcioButacaOcupada.
    }

    public void eliminarButaca() {
        //eliminarButaca: serà l’encarregat d’eliminar una butaca de l’ArrayList de butaques.
        // Rebrà com a paràmetres el número de fila i el seient i l’eliminarà de l’ArrayList.
        // Si la fila i el seient no coincideixen amb el d’una butaca reservada
        // (s’utilitzarà el mètode cercarButaca), llençarà una excepció personalitzada ExcepcioButacaLliure.
    }

    public void cercarButaca(){
    //cercarButaca: Cerca a l’ArrayList de butaques, la butaca que coincideixi
        // amb les dades rebudes com a paràmetre (fila i seient).
        // Si la troba retornarà la posició de la butaca a l’ArrayList i si no la troba retornarà -1.
    }




}
