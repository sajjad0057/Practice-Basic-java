package com.company;

public class Loop {
    public static void main(String[] args) {
        System.out.println("for Loop");
        System.out.println("---------------------------");
        for(int i =1;i<=10;i++){
            System.out.println("i = "+i);
        }

        System.out.println("while Loop");
        System.out.println("---------------------------");

        int x = 1;
        int y = 0;
        while (x<=10){
            y += x;
            x++;
        }
        System.out.println("Sum Of 1 to 10 : "+y);


        System.out.println("do while Loop");
        System.out.println("---------------------------");

        do{
            System.out.println("y : "+y);
            y -=5;

        }while (y>0);
    }
}
