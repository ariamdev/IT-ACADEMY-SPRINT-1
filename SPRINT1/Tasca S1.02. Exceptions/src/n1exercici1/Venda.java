package n1exercici1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Venda {

    private ArrayList<Producte> productes;
    private double preuTotal;

    public Venda () {
        this.productes = new ArrayList<Producte>();
        this.preuTotal = preuTotal;
    }

    public double getPreuTotal() {
        return this.preuTotal;
    }

    public void setPreuTotal(double preuTotal) {
        this.preuTotal = preuTotal;
    }

    public ArrayList<Producte> getProductes() {
        return this.productes;
    }

    public void afegirProducte(Producte producte){
        this.productes.add(producte);
    }

    public void comprobarVenta (ArrayList <Producte> productes) throws VendaBuidaException {
        if (productes.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
        }
    }

    public void calcularTotal() {
        try {
            comprobarVenta(this.productes);
            for (Producte producte : productes) {
                this.preuTotal += producte.getPreu();
            }
        } catch(VendaBuidaException e){
            System.out.println(e.getMessage());
        }
    }

        public void mostrarTicket(){
            System.out.println("Ticket cistella client:");
            for(Producte producte : productes){
                System.out.println(producte.getNom() + " " + producte.getPreu() + "€");
            }
            System.out.println("Preu final: " + this.preuTotal + "€");
        }
    }

