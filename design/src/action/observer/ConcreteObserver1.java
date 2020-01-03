package action.observer;

public class ConcreteObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("concrete observer 1 response");
    }
}
