package Task3.Task3_1;

import Task3.Task3_1.AbstractCommand;

import java.util.ArrayList;

public class GalleryController {
    private ArrayList<AbstractCommand> _commandsToExecute = new ArrayList<>();
    private ArrayList<AbstractCommand> _commandsHistory = new ArrayList<>();

    public GalleryController() {
    }

    public boolean addCommand(AbstractCommand command){
        return _commandsToExecute.add(command);
    }

    public boolean removeCommand(AbstractCommand command){
        return _commandsToExecute.remove(command);
    }

    public void executeCommand(){
        _commandsToExecute.getLast().execute();
        _commandsHistory.add(_commandsToExecute.getLast());
        removeCommand(_commandsToExecute.getLast());
    }

    public void undoCommand(AbstractCommand command){
        for (AbstractCommand c:
             _commandsHistory) {
            if (command.equals(c)){
                c.undo();
            }
        }
    }

    public void executeAllPendingCommands()
    {
        ArrayList<AbstractCommand> commandsCopy = new ArrayList<>(_commandsToExecute);
        for (AbstractCommand command : commandsCopy) {
            command.execute();
            _commandsHistory.add(command);
            _commandsToExecute.remove(command);
        }
    }

    public void undoChanges(int i)
    {
        for (int a = 0; a < i; a++) {

            _commandsHistory.get(a).undo();
            _commandsHistory.remove(_commandsHistory.get(a));
        }
    }
}
