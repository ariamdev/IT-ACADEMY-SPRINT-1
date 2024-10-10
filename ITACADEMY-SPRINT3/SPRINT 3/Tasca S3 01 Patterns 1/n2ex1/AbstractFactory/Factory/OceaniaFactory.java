package n2ex1.AbstractFactory.Factory;

import n2ex1.AbstractFactory.Interface.Adress;
import n2ex1.AbstractFactory.Interface.Implementation.OceaniaAdress;
import n2ex1.AbstractFactory.Interface.Implementation.OceaniaPhoneNumber;
import n2ex1.AbstractFactory.Interface.PhoneNumber;

public class OceaniaFactory implements AgendaFactory {
    @Override
    public Adress createAdress() {
        return new OceaniaAdress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new OceaniaPhoneNumber();
    }
}
