package action.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
//        handler2.setNext(handler1);
        handler1.operation("3");
    }
}
