package Task3.Task3_2;

import java.util.ArrayList;

public class TransportController {
    private ArrayList<AbstractCommand> _commandsToExecute = new ArrayList<>();
    private ArrayList<AbstractCommand> _commandsHistory = new ArrayList<>();

    public TransportController() {
    }

    public void executeCommand(){
        if (!_commandsToExecute.isEmpty()) {
            AbstractCommand command = _commandsToExecute.get(_commandsToExecute.size() - 1);
            command.execute();
            _commandsHistory.add(command);
            _commandsToExecute.remove(_commandsToExecute.size() - 1);
        }
    }

    public void undoCommand(){
        if (!_commandsHistory.isEmpty()) {
            AbstractCommand command = _commandsHistory.get(_commandsHistory.size() - 1);
            command.undo();
            _commandsHistory.remove(_commandsHistory.size() - 1);
        }
    }

    public boolean addCommand(AbstractCommand command){
        return _commandsToExecute.add(command);
    }

    public boolean removeCommand(AbstractCommand command){
        return _commandsToExecute.remove(command);
    }

    public void executeAll(){
        ArrayList<AbstractCommand> commandsCopy = new ArrayList<>(_commandsToExecute);
        for (AbstractCommand command : commandsCopy) {
            command.execute();
            _commandsHistory.add(command);
            _commandsToExecute.remove(command);
        }
    }

    public void undoChanges(){
        for (int i = _commandsHistory.size() - 1; i >= 0; i--) {
            AbstractCommand command = _commandsHistory.get(i);
            command.undo();
            _commandsHistory.remove(i);
        }
    }
}
