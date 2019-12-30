package action.state;

public class ConcreteState1 implements State{
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteState1());
    }
}
