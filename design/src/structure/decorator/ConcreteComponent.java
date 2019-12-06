package structure.decorator;

public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("初始");
    }
}
