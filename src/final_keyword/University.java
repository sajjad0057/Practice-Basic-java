package final_keyword;

public class University {
    final String name = "PUST";  // using final key ,variable cannot changed or updated.
    final int established; // blank final veriable .

    University(){
        established = 2008; // Only using constructor , can be updated blank final veriable .
    }

    void display(){
        System.out.println("University Name : "+name);
        System.out.println("Established : "+established);
    }
}
