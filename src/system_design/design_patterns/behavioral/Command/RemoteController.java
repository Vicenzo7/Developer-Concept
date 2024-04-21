package system_design.design_patterns.behavioral.Command;

import java.util.Stack;

public class RemoteController {

    private Command command;
    Stack<Command> commandHistoryStack = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistoryStack.push(command);
    }

    public void undo() {
        if (!commandHistoryStack.isEmpty()) {
            Command lastCommand = commandHistoryStack.pop();
            lastCommand.undo();
        }
    }

//    public void redo() {
//        if (!commandHistoryStack.isEmpty()) {
//            Command lastCommand = commandHistoryStack.pop();
//            lastCommand.redo();
//        }
//    }
}
