package com.company;

public class Bitwise {
    public static void main(String[] args) {
        System.out.println("Practice Bitwise Operator ");
        System.out.println("________________________________________________");
        int x = 32;
        int y = 12;
        int z;

        z = x & y;
        System.out.println("x & y : "+z);   // AND Logic

        z = x | y;
        System.out.println("x | y : "+z);  // OR logic

        z = x ^ y;
        System.out.println("x ^ y : "+z);  // X-OR logic

        z = x >> 3;   // rightshift... here x divided by 2 (3 times)
        System.out.println("x >> 3 : "+z);

        z = x << 3; // leftshift .... here x multiplied by 2 (3 times)
        System.out.println("x << 3 : "+z);

    }
}
