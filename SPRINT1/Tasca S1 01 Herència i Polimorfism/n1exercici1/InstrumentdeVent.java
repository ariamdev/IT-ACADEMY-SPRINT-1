package n1exercici1;

public class InstrumentdeVent extends Instruments {

    public InstrumentdeVent (String nom, int preu) {
        super(nom, preu);
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }


    public String toString() {
        return "Aquest és un instrument de vent corda anomenat " + super.getNom() + " amb un preu de " + super.getPreu() + " €.";
    }
}
