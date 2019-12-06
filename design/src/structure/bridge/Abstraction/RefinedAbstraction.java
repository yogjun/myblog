package structure.bridge.Abstraction;

import structure.bridge.implementor.ConcreteImplementorA;
import structure.bridge.implementor.ConcreteImplementorB;
import structure.bridge.implementor.Implementor;

public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operationForResult() {
        implementor.operation();
    }

    public static void main(String[] args) {
        Implementor implementor1 = new ConcreteImplementorA();
        Implementor implementor2 = new ConcreteImplementorB();
        Abstraction abstraction1 = new RefinedAbstraction(implementor1);
        abstraction1.operationForResult();
        Abstraction abstraction2 = new RefinedAbstraction(implementor2);
    }
}
