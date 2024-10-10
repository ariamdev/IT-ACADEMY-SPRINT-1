package n3ex1.Command.Classes;

public class Boat implements Vehicle{
    private String model;
    private String brand;
    private String color;

    public Boat(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }
    @Override
    public void start() {
        System.out.println("Starting the boat engine...\n" +
                "Boat turned on.\n");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the speed.\n");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car...\n" +
                "Boat stopped.\n");
    }

    @Override
    public String toString() {
        return model +" "+ brand +" "+ color;
    }
}

