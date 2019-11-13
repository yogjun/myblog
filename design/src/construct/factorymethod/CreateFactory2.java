package construct.factorymethod;

public class CreateFactory2 implements AbstractFactory{
    @Override
    public AbstractProduct getProduct() {
        return new CreateProduct2();
    }
}
