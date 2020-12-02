package statemachine.fsm.type;

public enum StateType {

    /**
     * 编辑中
     */
    EDITING(0, "编辑中"),

    /**
     * 待审核
     */
    TO_AUDIT(1, "待审核"),

    /**
     * 待上线
     */
    TO_ONLINE(2, "待上线"),

    /**
     * 已上线
     **/
    ONLINE(3, "已上线"),

    /**
     * 已下线
     **/
    OFFLINE(4, "已下线"),

    /**
     * 已删除
     **/
    DELETED(-1, "已删除");

    private final Integer code;

    private final String detail;

    public String getDetail() {
        return detail;
    }

    StateType(Integer code, String detail) {
        this.code = code;
        this.detail = detail;
    }

    public Integer getValue() {
        return code;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
