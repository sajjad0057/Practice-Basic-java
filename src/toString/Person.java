package toString;

/*
* Every class in java is child of Object class either directly or indirectly. Object class contains toString() method.
* We can use toString() method to get string representation of an object.
* Whenever we try to print the Object reference then internally toString() method is invoked.
* If we did not define toString() method in your class then Object class toString() method is invoked otherwise our implemented/Overridden toString() method will be called.

## Syntax of Object class toString() method:
public String toString()
    {
      return getClass().getName()+"@"+Integer.toHexString(hashCode());
    }
* */

public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "name : "+name +"\n Age : "+age;
    }
}
