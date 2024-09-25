package n3exercici1;

public class Butaca {
    private int numFila;
    private int numSeient;
    private String client;

    public Butaca(int numFila, int numSeient, String client) {
        this.numFila = numFila;
        this.numSeient = numSeient;
        this.client = client;
    }

    public int getNumFila() {
        return this.numFila;
    }

    public int getNumSeient() {
        return this.numSeient;
    }

    public String getClient() {
        return this.client;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Butaca butaca = (Butaca) obj;
        return numFila == butaca.numFila && numSeient == butaca.numSeient;
    }

    public String toString() {
        return "Fila: " + numFila + "Seient: " + numSeient + "Persona: " + client;
    }
}
