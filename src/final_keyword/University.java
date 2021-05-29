package final_keyword;

public class University {
    final String name = "PUST";  // using final key ,variable cannot changed or updated.
    static final int established; // static blank final veriable .

    static {
        established = 2008; // Only using static block , can be updated static blank final veriable .
    }

    final void display(){
        System.out.println("University Name : "+name);
        System.out.println("Established : "+established);
    }
}
