package construct.prototype.simple.java;

public class CreateType implements Cloneable{
    public CreateType() {
        System.out.println("创建");
    }
    public Object clone() throws CloneNotSupportedException{
        System.out.println("复制");
        return (CreateType)super.clone();
    }
}
