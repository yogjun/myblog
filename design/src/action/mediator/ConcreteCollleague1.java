package action.mediator;

public class ConcreteCollleague1 extends Colleague{
    @Override
    public void send() {
        System.out.println("1 发送消息");
        mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("1 接收消息");
    }
}
