package n2exercici1;

public class Main {

    public static void main(String[] args) {

        Entrada entrada = new Entrada();

        byte age =(Entrada.llegirByte("Introdueix la teva edat: "));

        int intLlegit = (Entrada.llegirInt("Introdueix el teu any de naixement: "));

        float floatLlegit = Entrada.llegirFloat("Introdueix la teva alçada: ");

        double doubleLlegit = Entrada.llegirDouble("Introdueix el teu pes (en kgs): ");

        char charLlegit = Entrada.llegirChar("Introdueix la inicial del teu nom: ");

        String stringLlegit = Entrada.llegirString("Introdueix el teu nom: ");

        boolean booleanLlegit = Entrada.llegirSiNo("Es el primer cop que et registres? (\"s\" per respondre \"sí\"" +
                " o el caràcter \"n\" per respondre \"no\") :");


    }
}
