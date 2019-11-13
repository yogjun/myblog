package construct.factorymethod;

public class CreateFactory implements AbstractFactory{
    @Override
    public AbstractProduct getProduct() {
        return new CreateProduct();
    }
}
