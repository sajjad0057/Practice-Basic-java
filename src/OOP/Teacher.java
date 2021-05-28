package OOP;

public class Teacher {
    String name, gender;
    int phone ;

    void displayInfo(){      // declare a method
        System.out.println("Teacher Name : "+name);
        System.out.println("Teacher Gender : "+gender);
        System.out.println("Teacher phone : "+phone);

    }

    void  setInfo(String n, String g, int p){
            name = n;
            gender = g;
            phone = p;
    };


}
