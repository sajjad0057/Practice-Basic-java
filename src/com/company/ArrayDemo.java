package com.company;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] number;  // declare int type array;
        String[] string ; // declare string type array;

        number = new int[10];  // array creation
        System.out.println("length of number array :"+number.length);
        for (int i = 0; i<number.length;i++){
            number[i] = i+1;
        }

        System.out.println("number[index] = value\n-----------------------");
        for (int i = 0; i<number.length;i++){
            System.out.printf("number[%d] = %d\n",i,number[i]);
        }

    }
}
