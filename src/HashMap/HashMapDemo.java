package HashMap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> customer = new HashMap<Integer,String>();  // like as dictionary in Python .
        customer.put(101,"sajjad");
        customer.put(122,"nafiul");
        customer.put(4535,"zahan");

        System.out.println("Customer : "+customer.get(101));
    }
}
