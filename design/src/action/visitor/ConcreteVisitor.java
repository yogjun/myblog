package action.visitor;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(ConcreteElement1 element1) {
        System.out.println("visit 1 访问");
        element1.operation1();
    }

    @Override
    public void visit(ConcreteElement2 element2) {
        System.out.println("visit 2 访问");
        element2.operation1();
    }
}
