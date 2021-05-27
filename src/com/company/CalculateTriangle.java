package com.company;

import java.util.Scanner;

public class CalculateTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base , height;

        System.out.print("Enter Tringle base : ");
        base = input.nextDouble();

        System.out.print("Enter Tringle height : ");
        height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.printf("Area Of triangle : %.2f",area);

    }
}
