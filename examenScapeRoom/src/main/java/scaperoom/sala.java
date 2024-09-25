package scaperoom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class sala {
    private static Set<String> ids = new HashSet<>();
    private String id;
    private String name;
    private dificultad lvl;
    private ArrayList<pistas> pistasSala;
    private ArrayList<objetos> objetosSala;
    private double euros;

    public sala(String id, String name) {
        this.setIds(id);
        this.name = name;
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

    public ArrayList<pistas> getPistasSala() {
        return pistasSala;
    }

    public void setPistasSala(ArrayList<pistas> pistasSala) {
        this.pistasSala = pistasSala;
    }

    public ArrayList<objetos> getObjetosSala() {
        return objetosSala;
    }

    public void setObjetosSala(ArrayList<objetos> objetosSala) {
        this.objetosSala = objetosSala;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public dificultad getLvl() {
        return lvl;
    }

    public void setLvl(dificultad lvl) {
        this.lvl = lvl;
    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }

    @Override
    public String toString() {
        return "sala{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lvl=" + lvl +
                ", euros=" + euros +
                '}';
    }
}
