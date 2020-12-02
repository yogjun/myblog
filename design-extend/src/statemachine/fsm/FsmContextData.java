package statemachine.fsm;


import statemachine.fsm.type.StateType;

public class FsmContextData {
    private StateType currentState;

    private StateType targetState;

    private Boolean updateSuccess = false;

    private String bean;

    public StateType getCurrentState() {
        return currentState;
    }

    public void setCurrentState(StateType currentState) {
        this.currentState = currentState;
    }

    public StateType getTargetState() {
        return targetState;
    }

    public void setTargetState(StateType targetState) {
        this.targetState = targetState;
    }

    public Boolean getUpdateSuccess() {
        return updateSuccess;
    }

    public void setUpdateSuccess(Boolean updateSuccess) {
        this.updateSuccess = updateSuccess;
    }

    public String getBean() {
        return bean;
    }

    public void setBean(String bean) {
        this.bean = bean;
    }
}
