package action.chainofresponsibility;

public class ConcreteHandler extends Handler{
    @Override
    public void operation(String request) {
        if (request == "1") {
            System.out.println("hadle 1");
        } else {
            if (getNext() != null) {
                getNext().operation(request);
            } else {
                System.out.println("nobody hadle");
            }
        }
    }
}
