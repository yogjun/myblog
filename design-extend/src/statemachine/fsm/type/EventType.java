package statemachine.fsm.type;

public enum EventType{

    /**
     * 提交审核
     */
    SUBMIT,

    /**
     * 驳回
     */
    REJECT,

    /**
     * 通过审核
     **/
    PASS,

    /**
     * 上线
     **/
    BE_ONLINE,

    /**
     * 下线
     **/
    BE_OFFLINE,

    /**
     * 删除
     **/
    DELETE;

    EventType() {
    }

    public String getValue() {
        return String.valueOf(this);
    }
}
