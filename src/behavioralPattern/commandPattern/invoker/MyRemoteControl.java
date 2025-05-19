package behavioralPattern.commandPattern.invoker;

import behavioralPattern.commandPattern.command.ICommand;
import lombok.Getter;
import lombok.Setter;

import java.util.Stack;

public class MyRemoteControl {
    ICommand command;
    Stack<ICommand> pastOperations = new Stack<>();

    public MyRemoteControl() {

    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        pastOperations.add(command);
    }

    public void undo(){
        if(!pastOperations.isEmpty()) {
            ICommand lastCommand = pastOperations.pop();
            lastCommand.undo();
        }
    }
}
