package action.state;

public class Context {
    private State state;

    public Context() {
        this.state = new ConcreteState1();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void operation(){
        state.handle(this);
    }
}
