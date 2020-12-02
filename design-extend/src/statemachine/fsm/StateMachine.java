package statemachine.fsm;

import statemachine.fsm.type.EventType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StateMachine {
    private List<StateTransaction> trans = new ArrayList<>(10);

    public void regist(StateTransaction transition) {
        trans.add(transition);
    }

    public void fireEvent(EventType event, FsmContextData contextData) throws Exception {
        Optional<StateTransaction> transactionOptional = trans.stream()
                .filter(transaction -> transaction.getEvent().equals(event) && transaction.getFrom().equals(contextData.getCurrentState()))
                .findFirst();
        if (!transactionOptional.isPresent()) {
//            log.info("事件{}，状态{}，未定义处理", event, contextData.getCurrentState());
            throw new Exception();
        }
        StateTransaction tran = transactionOptional.get();
        contextData.setTargetState(tran.getTo());
        tran.getAction().doAction(contextData);
        contextData.setCurrentState(tran.getTo());
//        log.info("事件{}，状态转移{}->{}", event, tran.getFrom(), tran.getTo());
    }

}
