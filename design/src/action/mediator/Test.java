package action.mediator;

import action.state.ConcreteState2;
import action.state.Context;

public class Test {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague c1 = new ConcreteCollleague1();
        Colleague c2 = new ConcreteCollleague2();
        mediator.register(c1);
        mediator.register(c2);
        c1.send();
        c2.send();
    }
}
