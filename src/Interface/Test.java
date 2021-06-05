package Interface;

public class Test {
    public static void main(String[] args) {
        Cow obj1 = new Cow();  //object can't create using interface
        obj1.eat();
        Cat obj2 = new Cat();
        obj2.eat();

    }
}
