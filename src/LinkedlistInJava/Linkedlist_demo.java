package LinkedlistInJava;

import java.util.LinkedList;

public class Linkedlist_demo {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("sajjad");
        name.add("arif");
        name.add("nafiul");
        name.add("arman");
        name.add("mahdi");
        name.add(3,"mehedi");
        name.addFirst("nayeem");
        name.addLast("rana");

        // see net to know more method about linkedlist .

        System.out.println("Size of the Linkedlist : "+name.size());
        for (String n : name){  // like forEach loop
            System.out.println("Name : "+n);
        }
    }
}
