package n2ex1.AbstractFactory.Factory;

import n2ex1.AbstractFactory.Interface.Adress;
import n2ex1.AbstractFactory.Interface.Implementation.AsiaAdress;
import n2ex1.AbstractFactory.Interface.Implementation.AsiaPhoneNumber;
import n2ex1.AbstractFactory.Interface.PhoneNumber;

public class AsiaFactory implements AgendaFactory {
    @Override
    public Adress createAdress() {
        return new AsiaAdress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new AsiaPhoneNumber();
    }
}
