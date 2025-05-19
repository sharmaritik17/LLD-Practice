package behavioralPattern.commandPattern.command.impl;

import behavioralPattern.commandPattern.command.ICommand;
import behavioralPattern.commandPattern.reciever.AirConditioner;

public class TurnACOnCommand implements ICommand {
    AirConditioner airConditioner;

    public TurnACOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAC();
    }

    @Override
    public void undo() {
        airConditioner.turnOffAC();
    }
}
