package examen1;

import java.util.ArrayList;

public class NPC {
    private String name;
    private category category;
    private String city;
    private ArrayList<Item> items;


    public NPC(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public examen1.category getCategory() {
        return category;
    }

    public void setCategory(examen1.category category) {
        this.category = category;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "NPC{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", city='" + city + '\'' +
                ", items=" + items +
                '}';
    }
}
