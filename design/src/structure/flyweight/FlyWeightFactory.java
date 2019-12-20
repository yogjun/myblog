package structure.flyweight;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class FlyWeightFactory {
    private HashMap<String,FlyWeight> flyWeightHashMap = new HashMap<>();
    public FlyWeight getFlyWeight(String key){
        FlyWeight fw = flyWeightHashMap.get(key);
        if (fw != null) {
            System.out.println("享元"+key+"直接获取！");
        } else {
            fw= new ConcreteFlyWeight(key);
            flyWeightHashMap.put(key,fw);
        }
        return fw;
    }

    public static void main(String[] args)
    {
        FlyWeightFactory factory=new FlyWeightFactory();
        FlyWeight f01=factory.getFlyWeight("a");
        FlyWeight f02=factory.getFlyWeight("a");
        FlyWeight f03=factory.getFlyWeight("a");
        FlyWeight f11=factory.getFlyWeight("b");
        FlyWeight f12=factory.getFlyWeight("b");
        f01.operation(new OutsideObject("第1次调用a。"));
        f02.operation(new OutsideObject("第2次调用a。"));
        f03.operation(new OutsideObject("第3次调用a。"));
        f11.operation(new OutsideObject("第1次调用b。"));
        f12.operation(new OutsideObject("第2次调用b。"));

    }
}
