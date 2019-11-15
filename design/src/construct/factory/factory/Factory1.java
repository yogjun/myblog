package construct.factory.factory;

import construct.factory.product.AbstractProduct1;
import construct.factory.product.AbstractProduct2;
import construct.factory.product.Product1_1;
import construct.factory.product.Product2_1;

public class Factory1 implements AbstractFactory{
    @Override
    public AbstractProduct1 getProduct1() {
        return new Product1_1();
    }

    @Override
    public AbstractProduct2 getProduct2() {
        return new Product2_1();
    }
}
