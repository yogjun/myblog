package action.memento;

import action.mediator.*;

public class Test {
    public static void main(String[] args) {
        Custom custom = new Custom();
        custom.setState("old");
        Manager manager = new Manager();
        manager.setMemento(custom.createMemento());
        custom.setState("new");
        custom.restoreMemento(manager.getMemento());
    }
}
