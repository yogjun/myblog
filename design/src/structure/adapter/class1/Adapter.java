package structure.adapter.class1;

import structure.adapter.common.Adaptee;
import structure.adapter.common.Target;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        operate1();
    }
}
