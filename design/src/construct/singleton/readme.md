定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。

3 个特点：
单例类只有**一个**实例对象
该单例对象必须由单例类**自行创建**
单例类对外提供**一个**访问该单例的**全局访问点**

几种使用到的单例模式
懒汉式
饿汉式
静态内部类单例模式(和懒汉式相似，用懒汉式即可)

应用场合：
1：在应用场景中，某类只要求生成一个对象的时候。
2：当对象需要被共享的场合。由于单例模式只允许创建一个对象，共享该对象可以节省内存，并加快对象访问速度。如 Web 中的配置对象、数据库的连接池等。
3：当某类需要频繁实例化，而创建的对象又频繁被销毁的时候，如多线程的线程池、网络连接池等。

技术tips：
volatile：singleton=new Singleton()对象的创建在JVM中可能会进行重排序，在多线程访问下存在风险，使用volatile修饰signleton实例变量有效，解决该问题。

volatile特点
可见性。对于一个volatile变量的读，总是能看到任意线程对这个变量的最后的修改。
有序性。对于存在指令重排序的情况，volatile会禁止部分指令重排序。

volatile内存语义
当写一个volatile变量时，JMM会立即将本地变量中对应的共享变量值刷新到主内存中。
当读一个volatile变量时，JMM会将线程本地变量存储的值，置为无效值，线程接下来将从主内存中读取共享变量。

synchronized：方法加锁