package construct.factorymethod;

public class CreateProduct implements AbstractProduct{
    @Override
    public void show() {
        System.out.println("我是创建的产品NO1");
    }
}
