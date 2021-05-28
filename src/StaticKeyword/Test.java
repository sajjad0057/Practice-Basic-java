package StaticKeyword;

public class Test {
    public static void main(String[] args) {
        // access non-static variable , need a class object
        Student student1 = new Student();
        System.out.println("University Name : "+student1.Uni_name);

        // access static variable no need to create class object .
        // by using class name access this variable .
        //Ex.

        System.out.println("Another University name : "+Student.another_uni_name);

    }
}
