package structure.decorator;

public class ConcreteDecoretorB extends Decorator{
    public ConcreteDecoretorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        setNewB();
        super.operation();
    }

    private void setNewB(){
        System.out.println("B");
    }
}
