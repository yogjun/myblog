package construct.factory;

import construct.factory.factory.Factory1;
import construct.factory.factory.Factory2;
import construct.factory.product.Product1_2;
import construct.factory.product.Product2_2;

public class Test {
    public static void main(String[] args) {
        Factory1 f1 = new Factory1();

        Factory2 f2 = new Factory2();
        Product1_2 p12 = (Product1_2)f2.getProduct1();
        Product2_2 p22 = (Product2_2)f2.getProduct2();
    }
}
