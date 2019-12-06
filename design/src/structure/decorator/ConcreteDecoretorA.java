package structure.decorator;

public class ConcreteDecoretorA extends Decorator{
    public ConcreteDecoretorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        setNewA();
        super.operation();
    }

    private void setNewA(){
        System.out.println("A");
    }
}
