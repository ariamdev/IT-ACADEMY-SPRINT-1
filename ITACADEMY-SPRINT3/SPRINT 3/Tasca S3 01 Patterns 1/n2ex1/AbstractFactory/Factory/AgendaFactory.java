package n2ex1.AbstractFactory.Factory;

import n2ex1.AbstractFactory.Interface.Adress;
import n2ex1.AbstractFactory.Interface.PhoneNumber;

public interface AgendaFactory {
    Adress createAdress();
    PhoneNumber createPhoneNumber();

}
