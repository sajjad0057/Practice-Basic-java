package OOP;

public class Test {
    public static void main(String[] args) {
//        Teacher teacher1; // object declare
//        teacher1 = new Teacher() // create object
        // declare and create object at a time :

        Teacher teacher1 = new Teacher(); // here declare and create teacher1 object from Teacher Class.
        teacher1.name = "sajjad hossain";
        teacher1.gender = "Male";
        teacher1.phone = 89954;

        teacher1.displayInfo();

        Teacher teacher2 = new Teacher(); // here declare and create teacher1 object from Teacher Class.
        teacher2.name = "Nafiul Fatta";
        teacher2.gender = "Male";
        teacher2.phone = 8995654;

        teacher2.displayInfo();



    }
}
