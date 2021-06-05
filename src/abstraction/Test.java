package abstraction;

public class Test {
    public static void main(String[] args) {
        // abstract class doesn't create object.
        MobileUser obj1,obj2 ; // reference variable
        obj1 = new UserOne(1233,"I am obj1");
        obj1.sendMessage();

        obj2 = new UserTwo(4635,"I am obj2");
        obj2.sendMessage();
        obj2.call();

    }
}
