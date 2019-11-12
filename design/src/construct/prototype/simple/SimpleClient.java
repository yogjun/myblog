package construct.prototype.simple;

public class SimpleClient {
    public static void main(String args[]){
        CreateType createType = new CreateType();
        CreateType createType2 = (CreateType)createType.clone();
    }
}
