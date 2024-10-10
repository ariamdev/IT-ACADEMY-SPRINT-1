package n2ex1.AbstractFactory.Interface.Implementation;

import n2ex1.AbstractFactory.Interface.PhoneNumber;

import java.util.Scanner;

public class EuropePhoneNumber implements PhoneNumber {
    private String number;

    public EuropePhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate the phone prefix according to the country: \n " +
                "Spain: +34\n" +
                "Germany: +49\n" +
                "France: +33\n" +
                "Italy: +39\n" +
                "United Kingdom: +44\n" +
                "Russia: +7\n" +
                "Ukraine: +380\n" +
                "Poland: +48\n" +
                "Romania: +40\n" +
                "Netherlands: +31\n" +
                "Belgium: +32\n" +
                "Greece: +30\n" +
                "Portugal: +351\n" +
                "Sweden: +46\n" +
                "Norway: +47");
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
