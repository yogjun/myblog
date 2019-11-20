package construct.builder;

public class ConcreteBuilder2 extends AbstractBuilder{
    @Override
    public void buildPartA() {
        product.setPartA("A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("C");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
