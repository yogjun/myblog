package action.strategy;

public class Test {
    public static void main(String[] args) {
        Strategy s1 = new ConcreteStrategy1();
        Strategy s2 = new ConcreteStrategy2();
        Context c = new Context(s1);
        c.method();
        c.setStrategy(s2);
        c.method();
    }
}
