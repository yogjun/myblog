package action.mediator;

public class ConcreteCollleague2 extends Colleague{
    @Override
    public void send() {
        System.out.println("2 发送消息");
        mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("2 接收消息");
    }
}
