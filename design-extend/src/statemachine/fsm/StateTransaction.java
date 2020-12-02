package statemachine.fsm;

import statemachine.fsm.action.Action;
import statemachine.fsm.type.EventType;
import statemachine.fsm.type.StateType;

public class StateTransaction {
    private StateType from;

    private Action action;

    private StateType to;

    private EventType event;

    public StateType getFrom() {
        return from;
    }

    public void setFrom(StateType from) {
        this.from = from;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public StateType getTo() {
        return to;
    }

    public void setTo(StateType to) {
        this.to = to;
    }

    public EventType getEvent() {
        return event;
    }

    public void setEvent(EventType event) {
        this.event = event;
    }
}
