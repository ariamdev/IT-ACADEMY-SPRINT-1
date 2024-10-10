package n2ex1.AbstractFactory.Interface.Implementation;

import n2ex1.AbstractFactory.Interface.PhoneNumber;

import java.util.Scanner;

public class OceaniaPhoneNumber implements PhoneNumber {
    private String number;

    public OceaniaPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate the phone prefix according to the country: \n " +
                "Australia: +61\n" +
                "New Zealand: +64\n" +
                "Fiji: +679\n" +
                "Papua New Guinea: +675\n" +
                "Tonga: +676");
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
