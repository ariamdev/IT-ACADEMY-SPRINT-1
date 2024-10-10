package n2ex1.AbstractFactory.Factory;

import n2ex1.AbstractFactory.Interface.Adress;
import n2ex1.AbstractFactory.Interface.Implementation.EuropeAdress;
import n2ex1.AbstractFactory.Interface.Implementation.EuropePhoneNumber;
import n2ex1.AbstractFactory.Interface.PhoneNumber;

public class EuropeFactory implements AgendaFactory {
    @Override
    public Adress createAdress() {
        return new EuropeAdress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new EuropePhoneNumber();
    }
}
