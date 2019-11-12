package construct.prototype.register.example;

public class Apple implements Fruit{
    @Override
    public Object clone() {
        Apple prototype = null;
        //复制属性
        try {
            prototype = (Apple)super.clone();
            System.out.println("复制Apple成功");
        }catch (CloneNotSupportedException e){
            System.out.println("复制Apple失败");
        }
        return prototype;
    }

    @Override
    public void speek() {
        System.out.println("我是苹果");
    }
}
