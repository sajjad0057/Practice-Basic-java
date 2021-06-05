package abstraction;

public class Test {
    public static void main(String[] args) {
        // abstract class doesn't create object.
        MobileUser obj1,obj2 ; // reference variable
        obj1 = new UserOne();
        obj1.sendMessage();

        obj2 = new UserTwo();
        obj2.sendMessage();
        obj2.call();

    }
}
