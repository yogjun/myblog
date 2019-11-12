package construct.prototype.simple.java;

/**
 * java的clone方法可以直接使用
 * */
public class Client {
    public static void main(String args[]) throws CloneNotSupportedException{
        CreateType createType = new CreateType();
        CreateType createType2 = (CreateType)createType.clone();
    }
}
