package deliverybrumm;

import java.util.ArrayList;

public class pedido {
    private int id;
    private int contadorID = 1;
    private cliente cliente;
    private ArrayList<products> products;
    private deliveryman deliveryman;

    public pedido(deliverybrumm.cliente cliente, ArrayList<deliverybrumm.products> products, deliveryman deliveryman) {
        this.cliente = cliente;
        this.products = products;
        this.id = contadorID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public deliverybrumm.cliente getCliente() {
        return cliente;
    }

    public void setCliente(deliverybrumm.cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<deliverybrumm.products> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<deliverybrumm.products> products) {
        this.products = products;
    }

    public deliverybrumm.deliveryman getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(deliverybrumm.deliveryman deliveryman) {
        this.deliveryman = deliveryman;
    }

    @Override
    public String toString() {
        return "Order Nº " + id +
                "\n Client: " + cliente +
                "\n Products: " + products +
                "\n Deliveryman: " + deliveryman;
    }
}
