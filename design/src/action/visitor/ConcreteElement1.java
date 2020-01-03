package action.visitor;

public class ConcreteElement1 implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void operation1(){
        System.out.println("element 1 operation");
    }

}
