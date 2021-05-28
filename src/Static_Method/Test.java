package Static_Method;

public class Test {
    public static void main(String[] args) {
        StaticMethodDemo m = new StaticMethodDemo();
        // call non static method using class object :
        m.M1();
        // call static method using direct class  :
        StaticMethodDemo.M2();
    }
}
