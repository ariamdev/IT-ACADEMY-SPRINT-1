package n1exercici1;

public class InstrumentdeCorda extends Instruments {

    public InstrumentdeCorda (String nom, int preu) {
        super(nom, preu);
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }

    public String toString() {
        return "Aquest és un instrument de corda anomenat " + super.getNom() + " amb un preu de " + super.getPreu() + " €.";
    }
}

