package n3ex1.Command.Commands;

import n3ex1.Command.Classes.Vehicle;

public class AccelerateVehicle implements Command{

    private Vehicle vehicle;

    public AccelerateVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.accelerate();
    }
}
