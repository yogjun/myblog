package construct.builder;

public class Director {
    private AbstractBuilder builder;
    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }
    public Product getProductTest(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }

    public static void main(String[] a){
        Director d1 = new Director(new ConcreteBuilder1());
        Director d2 = new Director(new ConcreteBuilder2());
        Product product1 = d1.getProductTest();
        Product product2 = d2.getProductTest();
        System.out.println("");
    }
}
