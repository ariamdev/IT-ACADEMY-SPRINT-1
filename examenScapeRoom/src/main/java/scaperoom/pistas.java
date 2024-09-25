package scaperoom;

import java.util.HashSet;
import java.util.Set;

public class pistas {

    /*Las pistas tienen un identificador único, precio, nombre ,
    tiempo estimado que se espera que los jugadores dediquen a resolver la pista y
    finalmente una temática específica que permitirá guiar a los jugadores en la
    resolución de enigmas.*/

    private static Set<String> ids = new HashSet<>();
    private static String id;
    private double price;
    private String name;
    private double time;
    private String tematica;

    public pistas(String id, double price, String name, double time, String tematica) {
        this.setIds(id);
        this.price = price;
        this.name = name;
        this.time = time;
        this.tematica = tematica;
    }

    public static Set<String> getIds() {
        return ids;
    }

    public void setIds(String id) {
        if (ids.contains( id )) {
            throw new IllegalArgumentException( "There can't be more than one ID with the same reference." );
        }
        ids.add( id );
        this.id = id;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        pistas.id = id;
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

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
}
