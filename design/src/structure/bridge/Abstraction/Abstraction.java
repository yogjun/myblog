package structure.bridge.Abstraction;

import structure.bridge.implementor.Implementor;

public abstract class Abstraction {
    public Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operationForResult();
}
