package Inheritance;
/*
Inheritance can be define as the process where one class acquires the properties (method and fields) of another .

*/
public class Person {
    private String name;
    private int age;



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
