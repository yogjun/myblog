package action.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator{
    private List<Colleague> colleagueList = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c : colleagueList) {
            if (!c.equals(colleague)) {
                c.receive();
            }
        }
    }
}
