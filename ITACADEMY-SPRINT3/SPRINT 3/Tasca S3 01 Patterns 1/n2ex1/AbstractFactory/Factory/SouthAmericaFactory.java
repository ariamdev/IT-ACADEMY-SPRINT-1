package n2ex1.AbstractFactory.Factory;

import n2ex1.AbstractFactory.Interface.Adress;
import n2ex1.AbstractFactory.Interface.Implementation.SouthAmericaAdress;
import n2ex1.AbstractFactory.Interface.Implementation.SouthAmericaPhoneNumber;
import n2ex1.AbstractFactory.Interface.PhoneNumber;

public class SouthAmericaFactory implements AgendaFactory {
    @Override
    public Adress createAdress() {
        return new SouthAmericaAdress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new SouthAmericaPhoneNumber();
    }
}
