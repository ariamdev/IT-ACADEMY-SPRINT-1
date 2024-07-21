package n1exercici1;

public class Main {

    public static void main(String[] args) {

        Instruments.metodeEstatic();

        InstrumentdeVent vent1 = new InstrumentdeVent("trompeta", 600);
        InstrumentdeCorda corda1 = new InstrumentdeCorda("Guitarra", 1000);
        InstrumentdePercussio percussio1 = new InstrumentdePercussio ("Tambor", 4000);

        System.out.println(vent1);
        System.out.println(corda1);
        System.out.println(percussio1);

        vent1.tocar();
        corda1.tocar();
        percussio1.tocar();

    }

}
