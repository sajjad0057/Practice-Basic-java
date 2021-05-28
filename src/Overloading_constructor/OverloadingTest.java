package Overloading_constructor;

public class OverloadingTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("zahan","female");
        Teacher teacher3 = new Teacher("sajjad","male",87583);
        teacher2.displayInfo();
        teacher3.displayInfo();
    }
}
