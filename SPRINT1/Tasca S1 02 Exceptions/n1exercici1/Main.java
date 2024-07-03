package n1exercici1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Venda client1 = new Venda();

        //Exemple funcional:

        client1.afegirProducte(new Producte("Pomes fuji", 1.38));
        client1.afegirProducte(new Producte("Safata pollastre", 2.87));
        client1.afegirProducte(new Producte("Yogurt", 1.30));

        client1.calcularTotal();
        client1.mostrarTicket();

        System.out.println("----------------------------------------------------------------");

        //Exemple amb error:
        Venda client2 = new Venda();

        client2.calcularTotal();

        System.out.println("----------------------------------------------------------------");

        //Exemple exeception "ArrayIndexOutOfBoundsException" personalitzada.

        try {
           Producte producteNotFound = client1.getProductes().get(4);
            System.out.println("Ticket error:"+ producteNotFound.getNom() + producteNotFound.getPreu());
        }catch (Exception e){
            System.out.println("Producte no trobat." + e.getMessage());
        } throw new ArrayIndexOutOfBoundsException ("Mostrar error pantalla:"); //Part opcional per mostrar el error a consola.





    }
}
