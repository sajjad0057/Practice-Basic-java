package com.company;

import java.util.Scanner;

public class ControllStatement_one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a Number : ");
        num =  input.nextInt();

        // Conditional statement :

        if ( num > 0 && num>1 ){
            System.out.printf("%d is Positive Number.",num);
        }else if(num==0){
            System.out.printf("%d is Equal to ZERO.",num);
        }else if(num==1){
            System.out.printf("%d is Equal to ONE.",num);
        }else{
            System.out.printf("%d is Negative Number.",num);
        }
    }
}
