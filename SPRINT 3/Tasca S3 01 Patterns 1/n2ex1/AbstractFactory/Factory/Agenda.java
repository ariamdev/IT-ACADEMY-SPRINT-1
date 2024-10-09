package n2ex1.AbstractFactory.Factory;

import n2ex1.AbstractFactory.Interface.Adress;
import n2ex1.AbstractFactory.Interface.PhoneNumber;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Agenda {
    private static ArrayList<Contact> listContacts = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void menuAgenda() {
        int opt;

        do {
            System.out.println("MENÚ: \n" +
                    "1.Create new contact. \n" +
                    "2.List of contacts. \n" +
                    "3.Exit.");
            opt = readInt();

            switch (opt) {
                case 1: createContact();
                    break;
                case 2: contactList();
                    break;
                default:
                    System.out.println("Please choose between the tree options.");

            }
        }while (opt!=0); {
            System.out.println("Bye bye!");
        }

    }

        public static void createContact(){
        int opt2;
        System.out.println("Write the contact name: ");
        String name = sc.next();
            System.out.println("Choose the continent: \n" +
                    "1. Asia\n" +
                    "2. Africa\n" +
                    "3. North America\n" +
                    "4. South America\n" +
                    "5. Europe\n" +
                    "6. Oceania");
            opt2 = readInt();
            switch (opt2) {
                case 1:
                  asiaContact(name);
                    break;
                case 2:
                    africaContact(name);
                    break;
                case 3:
                    northAmericaContact(name);
                    break;
                case 4:
                    southAmericaContact(name);
                    break;
                case 5:
                    europeContact(name);
                    break;
                case 6:
                    oceaniaContact(name);
                    break;
                default:
                    System.out.println("Please choose between the options.");
            }
        }

    public static int readInt(){
        int valorInt = 0;
        boolean valid = false;

        do {
            try {
                valorInt = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("Sisplau, introdueix un número integrer vàlid.");
                sc.nextLine();
            }
        } while (!valid);
        return valorInt;
    }

    public static void addContact(String name, Adress adress, PhoneNumber phoneNumber){
        try {
            listContacts.add(new Contact(name, adress, phoneNumber));
            System.out.println("The contact " + name + " has been added to the agenda.");
        }catch (Exception e){
            System.out.println("Error while adding the new contact. Please try again.");
        }
    }

    public static void asiaContact(String name){
        AsiaFactory asia = new AsiaFactory();
        Adress asiaAdress = asia.createAdress();
        PhoneNumber asiaPhone = asia.createPhoneNumber();
        addContact(name,asiaAdress,asiaPhone);
    }

    public static void africaContact(String name){
        AfricaFactory africa = new AfricaFactory();
        Adress africaAdress = africa.createAdress();
        PhoneNumber africaPhone= africa.createPhoneNumber();
        addContact(name,africaAdress,africaPhone);
    }

    public static void northAmericaContact(String name){
        NorthAmericaFactory america = new NorthAmericaFactory();
        Adress americaAdress = america.createAdress();
        PhoneNumber americaPhone = america.createPhoneNumber();
        addContact(name,americaAdress,americaPhone);
    }

    public static void southAmericaContact(String name){
        SouthAmericaFactory southAmerica = new SouthAmericaFactory();
        Adress southAdress = southAmerica.createAdress();
        PhoneNumber southNumber = southAmerica.createPhoneNumber();
        addContact(name,southAdress,southNumber);
    }

    public static void europeContact(String name){
        EuropeFactory europe = new EuropeFactory();
        Adress europeAdress = europe.createAdress();
        PhoneNumber europePhone = europe.createPhoneNumber();
        addContact(name,europeAdress,europePhone);
    }

    public static void oceaniaContact(String name){
        OceaniaFactory oceania = new OceaniaFactory();
        Adress oceaniaAdress = oceania.createAdress();
        PhoneNumber oceaniaPhone = oceania.createPhoneNumber();
        addContact(name,oceaniaAdress,oceaniaPhone);
    }

    public static void contactList(){
        try{
            if(listContacts.isEmpty()){
                throw new AgendaIsEmptyException("Error: The Agenda is empty. Please, add contacts first.\n");
            }else{
                for(Contact contact : listContacts){
                    System.out.println(contact.toString());
                }
            }
        } catch (AgendaIsEmptyException e) {
            System.out.println(e.getMessage());
        }
        }
    }




