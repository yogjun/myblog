package construct.prototype.register.example;

public class Client {
    public static void main(String[] args) {
        FruitManager fruitManager = new FruitManager();
        Fruit f1 = (Orange)fruitManager.getFruit("orange");
        Fruit f2 = (Apple)fruitManager.getFruit("apple");
        f1.speek();
        f2.speek();
    }
}
