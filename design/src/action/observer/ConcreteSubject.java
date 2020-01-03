package action.observer;

public class ConcreteSubject extends Subject{
    @Override
    void notifyObserver() {
        for (Observer observer:observerList) {
            observer.response();
        }
    }
}
