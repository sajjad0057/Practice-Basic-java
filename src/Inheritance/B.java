package Inheritance;

public class B  extends A{

    int x = 20;

    @Override
    void display(){

        System.out.println("A class : "+super.x);
        System.out.println("B class : "+x);
        super.display();
        System.out.println("Inside B class ");
    }
}
