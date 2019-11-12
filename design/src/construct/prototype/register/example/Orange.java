package construct.prototype.register.example;

public class Orange implements Fruit{
    @Override
    public Object clone() {
        Orange prototype = null;
        //复制属性
        try {
            prototype = (Orange)super.clone();
            System.out.println("复制Orange成功");
        }catch (CloneNotSupportedException e){
            System.out.println("复制Orange失败");
        }
        return prototype;
    }

    @Override
    public void speek() {
        System.out.println("我是橙子");
    }
}
