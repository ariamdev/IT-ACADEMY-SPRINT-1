package n3ex1.Command.Commands;

import n3ex1.Command.Classes.Vehicle;

public class StopVehicle implements Command{

    private Vehicle vehicle;

    public StopVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.stop();
    }
}
