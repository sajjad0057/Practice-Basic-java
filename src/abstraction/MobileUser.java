package abstraction;

/*
What is abstraction ?
-> Abstraction is the process of hiding the implementation details and showing only the functionality to the user.
-> Abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

-> Abstract class have abstract and non abstract method .
-> Non abstract class can't have abstract method .

## There are two ways to achieve abstraction in java .
 1. Abstract Class .(By this can be abstract  0-100)
 2. Interface ( Achieve 100% abstraction )


# Non abstract method :
 void message(){
    ........
 }
 ------------------------------------------------------
 # abstract method :
 abstract method :

 abstract void message();

 ## Point to remember about abstract method .
 > Abstract method has no body .
 > It must be end with semicolon .
 > It must be in the abstract class .

* */

public abstract class MobileUser {
    int mobileNo; String message;
    MobileUser(int m_no,String mess){
        mobileNo = m_no;
        message = mess;
    }
    abstract void sendMessage(); // abstract method .

    void call(){
        System.out.println("calling : "+mobileNo); // Non abstract method .
    }

}
