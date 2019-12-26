package action.command;



public class Test {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c1 = new ConcreteCommand1(r);
        Command c2 = new ConcreteCommand2(r);
        Invoker in = new Invoker(c1);
        in.request();
        in.setCommand(c2);
        in.request();
    }
}
