package n3ex1.Command.Classes;

public class Car implements Vehicle{
    private String model;
    private String brand;
    private String color;

    public Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Starting the car engine...\n" +
                "Car turned on");
    }

    @Override
    public void accelerate() {
    System.out.println("Accelerating the speed.");
    }

    @Override
    public void stop() {
    System.out.println("Braking the car...\n" +
            "Car stopped.");
    }

    @Override
    public String toString() {
        return   model + " " + brand + " " + color;
    }
}
