package HashMap;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruitsName = new HashSet<String>();  // like as pyhton set .

        fruitsName.add("apple");
        fruitsName.add("banana");
        fruitsName.add("mango");
        fruitsName.add("orange");
        fruitsName.add("orange");
        fruitsName.add("strwberry");
        // see more in net ..
        System.out.println("fruites name : "+fruitsName);
        System.out.println("Size : "+fruitsName.size());



    }
}
