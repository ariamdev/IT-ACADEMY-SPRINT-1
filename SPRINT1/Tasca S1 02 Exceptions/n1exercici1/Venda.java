package n1exercici1;

import java.util.ArrayList;

public class Venda {

    static ArrayList<Producte> producte;
    private double preuTotal;

    public Venda () {
        this.producte = producte;
        this.preuTotal = preuTotal;

    }

    public ArrayList<Producte> getProducte() {
        return this.producte;
    }

    public void setProducte(ArrayList<Producte> producte) {
        this.producte = producte;
    }

    public double getPreuTotal() {
        return this.preuTotal;
    }

    public void setPreuTotal(double preuTotal) {
        this.preuTotal = preuTotal;
    }

    public void afegirProducte(){

    }

    public void calcularTotal(){
           if (producte.isEmpty()){
               //EXCEPTION
           } else {
                   for (Producte productes : producte){
                       this.preuTotal += productes.getPreu();

               }


        }
    }

    //calcularTotal() - excepció VendaBuidaException "Per fer una venda primer has d'afegir productes".
    //- Si no recorre la colecio i guarda suma tots preus a l'atribut preu total venda
}
