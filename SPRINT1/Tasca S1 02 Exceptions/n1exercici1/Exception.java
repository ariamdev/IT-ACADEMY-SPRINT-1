package n1exercici1;

import java.util.ArrayList;

public class Exception {

    public void getMessage (){
        System.out.println("Per fer una venda primer has d'afegir productes.");
    }



    //L’excepció personalitzada VendaBuidaException ha de ser filla de la classe Exception.
    //excepció VendaBuidaException "Per fer una venda primer has d'afegir productes".
    //- Si no recorre la colecio i guarda suma tots preus a l'atribut preu total venda
    // Al seu constructor li hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i
    // quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.
    //Escriu el codi necessari per a generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException.
}
