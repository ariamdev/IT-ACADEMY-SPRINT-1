package n2ex1.AbstractFactory.Interface.Implementation;

import n2ex1.AbstractFactory.Interface.PhoneNumber;

import java.util.Scanner;

public class AsiaPhoneNumber implements PhoneNumber {
    private String number;

    public AsiaPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate the phone prefix according to the country:  \n" +
                "China: +86\n" +
                "India: +91\n" +
                "Japan: +81\n" +
                "South Korea: +82\n" +
                "Indonesia: +62\n" +
                "Turkey: +90\n" +
                "Philippines: +63\n" +
                "Thailand: +66\n" +
                "Vietnam: +84\n" +
                "Israel: +972\n" +
                "Malaysia: +60\n" +
                "Singapore: +65\n" +
                "Pakistan: +92\n" +
                "Bangladesh: +880\n" +
                "Saudi Arabia: +966\n" +
                "Iran: +98\n" +
                "Iraq: +964\n" +
                "Jordan: +962\n" +
                "Lebanon: +961\n" +
                "Kuwait: +965\n" +
                "United Arab Emirates: +971\n" +
                "Oman: +968\n" +
                "Qatar: +974\n" +
                "Bahrain: +973\n" +
                "Yemen: +967");
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
