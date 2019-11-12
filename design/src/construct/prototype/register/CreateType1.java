package construct.prototype.register;

public class CreateType1 implements Cloneable{
    private String name;

    @Override
    public Object clone() {
        CreateType1 prototype = null;
        //复制属性
        try {
            prototype = (CreateType1)super.clone();
            System.out.println("复制CreateType1成功");
        }catch (CloneNotSupportedException e){
            System.out.println("复制CreateType1失败");
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
