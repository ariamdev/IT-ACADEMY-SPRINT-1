package n3ex1.Command.Classes;

public class Bicycle implements Vehicle{
    private String model;
    private String color;

    public Bicycle(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Starting to ride the bicycle...\n" +
                "You are riding the bicycle.");
    }

    @Override
    public void accelerate() {
    System.out.println("Starting to accelerate the rhythm.");
    }

    @Override
    public void stop() {
    System.out.println("Braking the bicycle...\n" +
            "Bicycle stopped.");
    }

    @Override
    public String toString() {
        return  model + " " + color;
    }
}
