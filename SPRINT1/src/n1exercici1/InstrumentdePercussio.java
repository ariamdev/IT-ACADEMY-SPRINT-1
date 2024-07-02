package n1exercici1;

public class InstrumentdePercussio extends Instruments {


    public InstrumentdePercussio (String nom, int preu) {
        super(nom, preu);
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }


    public String toString() {
        return "Aquest és un instrument de percussió anomenat " + super.getNom() + " amb un preu de " + super.getPreu() + " €.";
    }
}

