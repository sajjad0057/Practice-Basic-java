package StaticKeyword;

public class Student {
    String name, subject;
    static String Uni_name = "PUST";
    Student(String n,String s){
        name = n;
        subject = s;
    }

    void displayInfo(){
        System.out.println("Student Name : "+name);
        System.out.println("Student subject : "+subject);
        System.out.println("Student University : "+Uni_name);
    }
}
