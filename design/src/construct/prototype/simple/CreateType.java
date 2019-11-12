package construct.prototype.simple;

public class CreateType implements SimplePrototype{
    @Override
    public SimplePrototype clone() {
        SimplePrototype prototype = new CreateType();
        //复制属性
        return prototype;
    }
}
