package n2ex1.AbstractFactory.Interface.Implementation;

import n2ex1.AbstractFactory.Interface.PhoneNumber;

import java.util.Scanner;

public class AfricaPhoneNumber implements PhoneNumber {
    private String number;

    public AfricaPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate the phone prefix according to the country: \n" +
                "Egypt: +20\n" +
                "South Africa: +27\n" +
                "Nigeria: +234\n" +
                "Kenya: +254\n" +
                "Morocco: +212\n" +
                "Algeria: +213\n" +
                "Uganda: +256\n" +
                "Ghana: +233\n" +
                "Cameroon: +237\n" +
                "Côte d'Ivoire: +225\n" +
                "Senegal: +221\n" +
                "Tanzania: +255\n" +
                "Sudan: +249\n" +
                "Libya: +218\n" +
                "Tunisia: +216");
        System.out.println("Enter the country prefix: ");
        String prefix = sc.nextLine();

        System.out.println("Enter the local phone number: ");
        String localnumber = sc.nextLine();

        this.number = prefix + " " + localnumber;
    }

    public String getPhoneNumber() {
        return this.number;
    }

}
