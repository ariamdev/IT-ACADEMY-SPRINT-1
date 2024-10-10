package n3ex1.Command.Commands;

import n3ex1.Command.Classes.Vehicle;

public class StartVehicle implements Command{

    private Vehicle vehicle;

    public StartVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.start();
    }
}
