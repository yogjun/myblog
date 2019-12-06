package structure.decorator;

public class TEST {
    public static void main(String[] args){
        Component component = new ConcreteComponent();
        component.operation();

        Component componentA = new ConcreteDecoretorA(component);
        componentA.operation();
        Component componentB = new ConcreteDecoretorB(component);
        componentB.operation();
    }
}
