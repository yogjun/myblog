package construct.singleton;

public class LazySingleton {
    //volatile关键字
    private static volatile LazySingleton lazySingleton = null;
    //使用private限制外部实现该类
    private LazySingleton() {}
    public static synchronized LazySingleton getInstence(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
