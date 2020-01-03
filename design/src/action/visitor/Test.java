package action.visitor;

import action.state.ConcreteState2;
import action.state.Context;

public class Test {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        Element element1 = new ConcreteElement1();
        Element element2 = new ConcreteElement2();
        Structure s = new Structure();
        s.add(element1);
        s.add(element2);
        s.accept(visitor);
    }
}
