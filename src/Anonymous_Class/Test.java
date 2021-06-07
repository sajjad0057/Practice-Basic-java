package Anonymous_Class;

public class Test {
    public static void main(String[] args) {
        Person obj = new Person(){    // anonymously overriding person class .
            void name(){
                System.out.println("Person name : sanwar hossain");
            }
        };
        obj.name();
    }
}
