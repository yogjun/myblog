package action.state;

public class ConcreteState2 implements State{
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteState2());
    }
}
