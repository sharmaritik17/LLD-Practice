package behavioralPattern.commandPattern.demo;

import behavioralPattern.commandPattern.command.impl.TurnACOffCommand;
import behavioralPattern.commandPattern.command.impl.TurnACOnCommand;
import behavioralPattern.commandPattern.invoker.MyRemoteControl;
import behavioralPattern.commandPattern.reciever.AirConditioner;

public class Demo {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();

        MyRemoteControl remoteObj = new MyRemoteControl();

        remoteObj.setCommand(new TurnACOnCommand(airConditioner));
        remoteObj.pressButton();
        remoteObj.undo();

        System.out.println("Next demo:: ");
        remoteObj.setCommand(new TurnACOffCommand(airConditioner));
        remoteObj.pressButton();
        remoteObj.undo();
    }
}
