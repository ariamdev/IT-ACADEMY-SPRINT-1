package n3exercici1;

public class Generic  {

    public static <T extends Telephone> void genericPhone (T telephone){
        telephone.phoneCall();
    }

    public static <T extends Smartphone> void genericSmartphone(T smartphone){
        smartphone.phoneCall();
        smartphone.takePhoto();
    }

}
