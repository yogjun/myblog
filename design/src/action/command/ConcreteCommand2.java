package action.command;

public class ConcreteCommand2 implements Command{
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.operation(1);
        receiver.operation(2);
    }
}
