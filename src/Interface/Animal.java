package Interface;

/*
## There are two ways to achieve abstraction in java .
 1. Abstract Class .(By this can be abstract  0-100)


 2. Interface ( Achieve 100% abstraction )[
 Now, What is Interface ?
 -> An interface is a collection of abstract methods.

 Why need an Interface ?
 -> For fully abstraction .
 -> Its supports multiple inheritance .


Interface have the following properties .
- Each method in an interface is also implicitly abstract , so the
abstract keyword is not needed.
- Methods in an interface are implicitly public .
- A class can inherit from just one superclass , but A class  can implement multiple interface !
_ object can't create using interface

]
[
# Difference Between interface and class :
-> Can't instantiate an interface .
-> Interface doesn't contain constructor .
-> All the methods in interface are abstract .
-> An Interface can not have instance variables .
-> An Interface can extend multiple interface .
]

*/

public interface Animal {
    public abstract void eat();
}
