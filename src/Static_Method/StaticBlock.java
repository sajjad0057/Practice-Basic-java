package Static_Method;

public class StaticBlock {
    static int id;
    static String name;

    // static block using initialize static variable .

    static {
        System.out.println("static block execute before main method execution");
        id = 1111;
        name = "sajjad";
    }

    static void display(){
        System.out.printf("Id : %d and name : %s",id,name);
    }

    public static void main(String[] args) {
        System.out.println("main method execute after static block execution");
        StaticBlock.display();
    }
}
