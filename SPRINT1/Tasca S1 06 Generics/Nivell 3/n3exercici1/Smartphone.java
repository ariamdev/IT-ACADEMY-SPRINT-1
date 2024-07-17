package n3exercici1;

public class Smartphone implements  Telephone{

    @Override
    public void phoneCall(){
        System.out.println("Calling... ");
    }

    public void takePhoto(){
        System.out.println("Taking a photo...");
    }
}
