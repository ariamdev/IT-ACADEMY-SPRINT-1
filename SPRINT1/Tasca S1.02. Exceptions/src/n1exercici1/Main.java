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

        //Exemple amb excepcio VendaBuidaException:
        Venda client2 = new Venda();

        client2.calcularTotal();

        System.out.println("----------------------------------------------------------------");

        //Exemple excepcio ArrayIndexOutOfBoundsException:

        int[] exemple = {1,2,3};
        try {
            System.out.println(exemple[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index de exemple fora de rang. " + e.getMessage());
        }

        System.out.println("----------------------------------------------------------------");

        //Exemple exeception personalitzada (IndexOutOfBoundsException).

        try {
           Producte producteNotFound = client1.getProductes().get(4);
            System.out.println("Ticket error: "+ producteNotFound.getNom() + producteNotFound.getPreu());
        }catch (IndexOutOfBoundsException  e){
            System.out.println("Producte no trobat. " + e.getMessage());
        }

    }
}
