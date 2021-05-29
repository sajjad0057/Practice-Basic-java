package Encapsulation;

public class Person {

    private String name;
    private int age;

    void display(){
        System.out.printf(name , age);
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }


}
