package structure.flyweight;

public class ConcreteFlyWeight implements FlyWeight{

    private String key;

    public ConcreteFlyWeight(String key) {
        this.key = key;
        System.out.println("享元"+key+"创建成功！");
    }

    @Override
    public void operation(OutsideObject state) {
        System.out.println("享元"+key+"被调用！");
        System.out.println("外界非享元部分是"+key+"！");
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
