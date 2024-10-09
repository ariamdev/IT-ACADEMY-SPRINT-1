package n3ex1.Command.Commands;

import n3ex1.Command.Classes.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private List<Command> history;

    public void addCommand(Command command) {
        history.add(command);
    }

    public void executeCommands() {
        this.history.forEach(c -> c.execute());
        this.history.clear();
    }
}
