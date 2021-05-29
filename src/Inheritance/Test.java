package Inheritance;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Anwar parvej");
        teacher.setAge(45);
        teacher.setQualification("Math Teacher");
        teacher.displayInfo();



        // practice super keyword .
        System.out.println("----------------------------------\n" +
                "practice super keyword \n" +
                "-----------------------------------");
        B obj = new B();
        obj.display();
    }
}
