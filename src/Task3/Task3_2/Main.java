package Task3.Task3_2;

public class Main {
    public static void main(String[] args){
        Transport t1 = new Transport("A1", 1999, 28942);
        Transport t2 = new Transport("B3", 1959, 95893);
        Transport t3 = new Transport("L0", 1968, 99999);

        TransportController controller = new TransportController();
        AbstractCommand c1 = new InformTransportCommand(t1);
        AbstractCommand c2 = new ReasignCarIDCommand(t2, 35838);
        AbstractCommand c3 = new RenameTransportCommand(t3, "PL");

        AbstractCommand c11 = new InformTransportCommand(t1);
        AbstractCommand c22 = new ReasignCarIDCommand(t2, 84844);
        AbstractCommand c33 = new RenameTransportCommand(t3, "LOLL");

        controller.addCommand(c1);
        controller.addCommand(c2);
        controller.addCommand(c3);

        controller.executeAll();
        controller.undoChanges();

        controller.addCommand(c11);
        controller.addCommand(c22);
        controller.addCommand(c33);

        controller.removeCommand(c11);
        controller.executeCommand();
        controller.executeCommand();
        controller.undoCommand();
    }
}
