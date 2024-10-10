package n2ex1.AbstractFactory.Interface.Implementation;

import n2ex1.AbstractFactory.Interface.PhoneNumber;

import java.util.Scanner;

public class SouthAmericaPhoneNumber implements PhoneNumber {
    private String number;

    public SouthAmericaPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate the phone prefix according to the country: \n" +
                "Mexico: +52\n" +
                "Brazil: +55\n" +
                "Argentina: +54\n" +
                "Colombia: +57\n" +
                "Chile: +56\n" +
                "Venezuela: +58\n" +
                "Peru: +51\n" +
                "Ecuador: +593\n" +
                "Cuba: +53\n" +
                "Bolivia: +591\n" +
                "Costa Rica: +506\n" +
                "Panama: +507\n" +
                "Uruguay: +598");
        System.out.println("Enter the country prefix: ");
        String prefix = sc.nextLine();

        System.out.println("Enter the local phone number: ");
        String localnumber = sc.nextLine();

        this.number = prefix + " " + localnumber;
    }

    public String getPhoneNumber() {
        return number;
    }

}
