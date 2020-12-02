package statemachine.fsm.action;

import statemachine.fsm.FsmContextData;

public interface Action {
    void doAction(FsmContextData contextData);
}
