package n2ex1.AbstractFactory.Factory;

import n2ex1.AbstractFactory.Interface.Adress;
import n2ex1.AbstractFactory.Interface.Implementation.NorthAmerciaPhoneNumber;
import n2ex1.AbstractFactory.Interface.Implementation.NorthAmericaAdress;
import n2ex1.AbstractFactory.Interface.PhoneNumber;

public class NorthAmericaFactory implements AgendaFactory {
    @Override
    public Adress createAdress() {
        return new NorthAmericaAdress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new NorthAmerciaPhoneNumber();
    }
}
