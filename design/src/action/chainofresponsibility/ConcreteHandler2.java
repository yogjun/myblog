package action.chainofresponsibility;

public class ConcreteHandler2 extends Handler{
    @Override
    public void operation(String request) {
        if (request == "2") {
            System.out.println("hadle 2");
        } else {
            if (getNext() != null) {
                getNext().operation(request);
            } else {
                System.out.println("nobody hadle");
            }
        }
    }
}
