package construct.singleton;
/**
 * 类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 * */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton() {}
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
