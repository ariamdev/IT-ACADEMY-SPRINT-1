package examen1;

public class Item {

    private String nameItem;
    private String type;
    private double price;

    public Item(String nameItem, String type, double price) {
        this.type = type;
        this.price = price;
        this.nameItem = nameItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Inventory: \n" +
                "Name: " + nameItem + " Type: " + type + " Price: " + price;
    }
}
