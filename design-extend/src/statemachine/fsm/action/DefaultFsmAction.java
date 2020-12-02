package statemachine.fsm.action;

import statemachine.fsm.FsmContextData;

public class DefaultFsmAction implements Action {
    @Override
    public void doAction(FsmContextData contextData) {
        System.out.println("当前状态：{}" + contextData.toString());
        // 更新状态
        contextData.setBean("state" + contextData.getTargetState().getValue());
        if (true) {
            contextData.setUpdateSuccess(true);
        } else {
            contextData.setUpdateSuccess(false);
        }
    }
}
