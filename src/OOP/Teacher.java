package OOP;

public class Teacher {
    String name, gender;
    int phone ;
    /*
    A constructor in Java is a special method that is used to initialize objects.
    The constructor is called when an object of a class is created.
    It can be used to set initial values for object attributes:
    In java Class name and constructor name must be same.
    In java Two Types of constructor :
    1. Parametrized constructor
    2. Default constructor
    In java class A default constructor create automatically in backend.

    */

    Teacher(){  //Default constructor
        System.out.println("It is default constructor");
    }

    Teacher(String n , String g, int p){  // Parametrized constructor
       name = n;
       gender = g;
       phone = p;
    }



    void displayInfo(){      // declare a method
        System.out.println("Teacher Name : "+name);
        System.out.println("Teacher Gender : "+gender);
        System.out.println("Teacher phone : "+phone);

    }

    void  setInfo(String n, String g, int p){  //Parametrized method
            name = n;
            gender = g;
            phone = p;
    };


}
