package construct.singleton;

/**
 * 类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。
 * */
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
