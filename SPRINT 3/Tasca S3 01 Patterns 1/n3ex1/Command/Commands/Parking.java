package n3ex1.Command.Commands;

import n3ex1.Command.Classes.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private List<Vehicle> vehicles;
    private List<Command> history;

    public Parking() {
        vehicles = new ArrayList<>();
        history = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addCommand(Command command) {
        command.execute();
        history.add(command);
    }

    public void executeCommands() {
        this.history.forEach(c -> c.execute());
        this.history.clear();
    }
}
