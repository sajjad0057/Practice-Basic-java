package com.company;

import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args){
        int age = 30;
        int herAge = 55;
        System.out.printf("%d  %d\n",age,herAge);  // For using formatSpecifier must be use printf()


        // user input:
        Scanner input = new Scanner(System.in);
        char name;
        int number = input.nextInt();
        name = input.next().charAt(0);
        System.out.printf("Number = %d and Name is %c\n",number,name);
    }
}
