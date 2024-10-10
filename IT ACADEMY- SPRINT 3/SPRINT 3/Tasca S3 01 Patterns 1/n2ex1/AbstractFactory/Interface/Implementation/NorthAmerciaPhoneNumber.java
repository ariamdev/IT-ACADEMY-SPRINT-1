package n2ex1.AbstractFactory.Interface.Implementation;

import n2ex1.AbstractFactory.Interface.PhoneNumber;

import java.util.Scanner;

public class NorthAmerciaPhoneNumber implements PhoneNumber {
    private String number;

    public NorthAmerciaPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate the phone prefix according to the country: \n" +
                "United States: +1\n" +
                "Canada: +1");
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
