package construct.prototype.register;

public class CreateType2 implements Cloneable{
    private String name;

    @Override
    public Object clone() {
        CreateType2 prototype = null;
        //复制属性
        try {
            prototype = (CreateType2)super.clone();
            System.out.println("复制CreateType2成功");
        }catch (CloneNotSupportedException e){
            System.out.println("复制CreateType2失败");
        }
        return prototype;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
