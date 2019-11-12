package construct.prototype.register;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    private static Map<String,Cloneable> prototypeMap = new HashMap<>();
    public synchronized void add(String key,Cloneable prototype){
        prototypeMap.put(key,prototype);
    }
    public synchronized void remove(String key){
        prototypeMap.remove(key);
    }
    public static synchronized Cloneable getPrototype(String key)throws Exception{
        Cloneable prototype = prototypeMap.get(key);
        if (prototype == null) {
        throw new Exception("要获取的原型不存在");
        }
        return prototype;
    }
}
