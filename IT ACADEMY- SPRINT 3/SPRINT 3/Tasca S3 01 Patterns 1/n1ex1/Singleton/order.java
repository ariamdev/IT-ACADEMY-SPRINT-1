package n1ex1.Singleton;

import java.util.Scanner;

public class order {


    private String name;
    private int ID;
    private String adress;

    public order(String name, int ID, String adress) {
        this.name = name;
        this.ID = ID;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    @Override
    public String toString() {
        return "Order:\n" +
                "Name " + name +
                " ID: " + ID +
                " Adress : " + adress;
    }
}
