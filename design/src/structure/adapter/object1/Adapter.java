package structure.adapter.object1;

import structure.adapter.common.Adaptee;
import structure.adapter.common.Target;

public class Adapter implements Target {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.operate1();
    }

    public static void main(String[] s){
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
