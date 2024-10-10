package n2ex1.AbstractFactory.Factory;

import n2ex1.AbstractFactory.Interface.Adress;
import n2ex1.AbstractFactory.Interface.Implementation.AfricaAdress;
import n2ex1.AbstractFactory.Interface.Implementation.AfricaPhoneNumber;
import n2ex1.AbstractFactory.Interface.PhoneNumber;

public class AfricaFactory implements AgendaFactory {
    @Override
    public Adress createAdress() {
        return new AfricaAdress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new AfricaPhoneNumber();
    }
}
