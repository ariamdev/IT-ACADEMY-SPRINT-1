package n1exercici2;

public class calculDni {

    private char letter;
    private int id;

    public calculDni(int id) {
        this.id = id;
        this.letter = letter;
    }

    public char getLetter() {
        return this.letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char calculateLetter () {
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        char character = letters.charAt(id % letters.length());
        return character;
    }

    @Override
    public String toString() {
        return "The ID letter is: " + this.letter;
    }
}
