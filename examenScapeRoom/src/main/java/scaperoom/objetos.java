package scaperoom;

import java.util.HashSet;
import java.util.Set;

public class objetos {
    /*Objetos de Decoración Únicos: Los objetos de decoración contribuyen a la
    atmósfera inmersiva de cada sala. Tienen un identificador único, precio,
    descripción/nombre y tipo de material.*/

    private static Set<String> ids = new HashSet<>();
    private String id;
    private double price;
    private String name;
    private String description;
    private String material;

    public objetos(String id, double price, String name, String description, String material) {
        this.setIds(id);
        this.price = price;
        this.name = name;
        this.description = description;
        this.material = material;
    }

    public void setIds(String id) {
        if (ids.contains( id )) {
            throw new IllegalArgumentException( "There can't be more than one ID with the same reference." );
        }
        ids.add( id );
        this.id = id;
    }

    public static Set<String> getIds() {
        return ids;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }



    @Override
    public String toString() {
        return "Inventory: \n" +
                "Name: " + name + " ID: " + id + " Price: " + price +
                "\n Description: " + description + " Material: " + material;

    }
}
