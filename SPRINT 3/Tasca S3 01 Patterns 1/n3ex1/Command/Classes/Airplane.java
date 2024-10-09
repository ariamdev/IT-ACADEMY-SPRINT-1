package n3ex1.Command.Classes;

public class Airplane implements Vehicle{
    private String model;
    private String manufacturer;

    public Airplane(String model, String manufacturer ) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
    @Override
    public void start() {
        System.out.println("Starting the plane engine...\n" +
                "Airplane flying.");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the speed.");
    }

    @Override
    public void stop() {
        System.out.println("Landing the airplane...\n" +
                "Airplane landed.");
    }

    @Override
    public String toString() {
        return  model + " "+ manufacturer;
    }
}

