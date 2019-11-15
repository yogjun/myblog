package construct.factory.factory;

import construct.factory.product.*;

public class Factory2 implements AbstractFactory{
    @Override
    public AbstractProduct1 getProduct1() {
        return new Product1_2();
    }

    @Override
    public AbstractProduct2 getProduct2() {
        return new Product2_2();
    }
}
