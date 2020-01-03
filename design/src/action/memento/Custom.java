package action.memento;

public class Custom {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }
    public void restoreMemento(Memento m){
        m.setState(this.state);
    }
}
