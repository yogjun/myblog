package statemachine.fsm;

import statemachine.fsm.action.Action;

public class StateConfig {

//    @AutoWire
    private Action defaultFsmAction;
//    @Bean
    public StateMachine fsmOrderMachine() {
        StateMachine machine = new StateMachine();
        //编辑->待审核  提交
//        machine.regist(ActivityStateTransaction
//                .builder()
//                .from(ActivityStateType.EDITING)
//                .to(ActivityStateType.TO_AUDIT)
//                .event(ActivityEventType.SUBMIT)
//                .action(defaultFsmAction).build());
//        machine.regist(ActivityStateTransaction
//                .builder()
//                .from(ActivityStateType.EDITING)
//                .to(ActivityStateType.DELETED)
//                .event(ActivityEventType.DELETE)
//                .action(defaultFsmAction).build());
//        log.info("初始化状态机实例：{}", machine);
        return machine;
    }

}
