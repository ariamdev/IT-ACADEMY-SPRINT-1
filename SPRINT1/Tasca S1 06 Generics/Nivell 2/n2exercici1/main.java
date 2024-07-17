package n2exercici1;

public class main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Ainoa ","Aran ",30);
        String city = "Barcelona";
        String country = "Spain";
        int year= 2024;

        GenericMethods.metodGeneric(persona1,city,year);
        //GenericMethods.metodGeneric(persona1,city,country); No compila con argumento String, en método se indica int.



    }
}
