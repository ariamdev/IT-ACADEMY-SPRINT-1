package n2ex1.AbstractFactory.Interface.Implementation;

import n2ex1.AbstractFactory.Interface.Adress;

import java.util.Scanner;

public class SouthAmericaAdress implements Adress {
    private String adress;

    public SouthAmericaAdress() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write the address for a country on South America : ");
        this.adress = sc.nextLine();
    }

    public String getAdress() {
        return adress;
    }
}
