package action.visitor;

public class ConcreteElement2 implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void operation1(){
        System.out.println("element 2 operation");
    }

}
