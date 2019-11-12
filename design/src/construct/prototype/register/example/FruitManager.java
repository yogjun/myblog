package construct.prototype.register.example;

import java.util.HashMap;
import java.util.Map;

public class FruitManager {
    private Map<String,Fruit> fruitMap = new HashMap<>();

    public FruitManager() {
        add("orange",new Orange());
        add("apple",new Apple());
    }
    public synchronized void add(String key, Fruit fruit){
        fruitMap.put(key,fruit);
    }
    public synchronized void remove(String key){
        fruitMap.remove(key);
    }
    public synchronized Fruit getFruit(String key){
        Fruit fruit = fruitMap.get(key);
        if (fruit == null) {
            System.out.println("点的水果不存在!");
        }
        return (Fruit)fruit.clone();
    }

}
