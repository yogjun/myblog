package action.state;

import action.chainofresponsibility.ConcreteHandler;
import action.chainofresponsibility.ConcreteHandler2;
import action.chainofresponsibility.Handler;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.operation();
        context.setState(new ConcreteState2());
        context.operation();
    }
}
