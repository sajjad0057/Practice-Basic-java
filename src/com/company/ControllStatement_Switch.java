package com.company;

import java.util.Scanner;

public class ControllStatement_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int digit = input.nextInt();

        switch (digit){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;  // if don't use break program mightbe print unwanted case.
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println(digit);

        }
    }
}



