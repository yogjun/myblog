package construct.factory.factory;

import construct.factory.product.AbstractProduct1;
import construct.factory.product.AbstractProduct2;

public interface AbstractFactory {
    AbstractProduct1 getProduct1();
    AbstractProduct2 getProduct2();
}
