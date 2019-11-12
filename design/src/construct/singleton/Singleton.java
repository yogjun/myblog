package construct.singleton;
/**
 * 第一次调用getInstance方法时，虚拟机才加载 Inner 并初始化instance
 * */
public class Singleton {
    private Singleton() {}
    public static Singleton getInstance(){
        return InnerSingleton.singleton;
    }
    private static class InnerSingleton {
        private static Singleton singleton = new Singleton();
    }
}
