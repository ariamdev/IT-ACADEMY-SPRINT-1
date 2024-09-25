package deliverybrumm;

public class deliveryman {

    private String name;
    private boolean disponibility = true;
    private transport transport;

    public deliveryman(String name, transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDisponibility() {
        return disponibility;
    }

    public void setDisponibility(boolean disponibility) {
        this.disponibility = disponibility;
    }

   public double setPrice(transport transport, double precio ){
        double finalPrice = 0;
        if (transport.equals(deliverybrumm.transport.BIKE)) {
            finalPrice = (precio * 1) / 100;
        } else if (transport.equals(deliverybrumm.transport.MOTO)) {
            finalPrice = (precio*2)/100;
        } else {
            finalPrice = precio;
        }
       return finalPrice;
    }

    @Override
    public String toString() {
        return "Deliveryman: " +
                "\n Name: " + name +
                "\n Transport: " + transport;
    }
}
