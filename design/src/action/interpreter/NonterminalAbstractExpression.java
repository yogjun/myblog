package action.interpreter;

public class NonterminalAbstractExpression implements AbstractExpression{
    private AbstractExpression exp1;
    private AbstractExpression exp2;
    @Override
    public Object interpret(String info) {
        //对非终结符处理
        return null;
    }
}
