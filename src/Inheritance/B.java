package Inheritance;

public class B  extends A{

    int x = 20;
    void display(){

        System.out.println("A class : "+super.x);
        System.out.println("B class : "+x);
    }
}
