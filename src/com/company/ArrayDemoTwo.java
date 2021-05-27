package com.company;

public class ArrayDemoTwo {
    public static void main(String[] args) {

        // Initializing Array :


        //int[] data = {10,20,30,40,50,60,71,80,90,91};
// or
        int[] data;
        data = new int[] {10,20,30,40,50,60,71,80,90,91};
       // for loop :
        System.out.println("print array value using for loop :\n----------------------------------");
        for (int i =0; i< data.length;i++){
            System.out.printf("data[%d] = %d\n ",i,data[i]);
        }


        // for each loop :
        System.out.println("print array value using for each loop :\n----------------------------------------");
        for (int x : data){
            System.out.println(x);
        }

    }
}
