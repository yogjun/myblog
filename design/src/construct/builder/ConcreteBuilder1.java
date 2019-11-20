package construct.builder;

public class ConcreteBuilder1 extends AbstractBuilder{
    @Override
    public void buildPartA() {
        product.setPartA("a");
    }

    @Override
    public void buildPartB() {
        product.setPartB("b");
    }

    @Override
    public void buildPartC() {
        product.setPartC("c");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
