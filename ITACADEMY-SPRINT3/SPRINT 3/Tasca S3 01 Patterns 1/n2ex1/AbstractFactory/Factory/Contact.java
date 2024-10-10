package n2ex1.AbstractFactory.Factory;

import n2ex1.AbstractFactory.Interface.Adress;
import n2ex1.AbstractFactory.Interface.PhoneNumber;

public class Contact {
    private String name;
    private Adress adress;
    private PhoneNumber phoneNumber;

    public Contact(String name, Adress adress, PhoneNumber phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact: \n" +
                "Name: " + this.name + "\n" +
                "Adress: " + this.adress.getAdress() + "\n" +
                "Phone Number: " + this.phoneNumber.getPhoneNumber();
    }
}
