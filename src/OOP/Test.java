package OOP;

public class Test {
    public static void main(String[] args) {
//        Teacher teacher1; // object declare
//        teacher1 = new Teacher() // create object
        // declare and create object at a time :

        Teacher teacher1 = new Teacher(); // here declare and create teacher1 object from Teacher Class.

        teacher1.setInfo("sajjad Hossain","male",87458);
        teacher1.displayInfo();

        Teacher teacher2 = new Teacher(); // here declare and create teacher1 object from Teacher Class.
        teacher2.setInfo("xyz","male",8784458);

        teacher2.displayInfo();



    }
}
