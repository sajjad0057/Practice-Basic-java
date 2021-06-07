package ExceptionHandling;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        boolean flug = true;
        while (flug){
            try {
                int x, y;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter First Number : ");
                x = input.nextInt();
                System.out.println("Enter Second Number : ");
                y = input.nextInt();
                double result = x/y;
                System.out.println("x divided y  : "+result);
                flug = false;
            }catch (ArithmeticException e){   // here   e  class ArithmeticException class reference .
                System.out.println("Occur an Exception : "+e);
                System.out.println("Please try Again ..... ");
            }
            catch (Exception e2){
                System.out.println("exception Occur : "+e2);
                System.out.println("Please try Again ..... ");
            }
            finally {
                System.out.println("Final execution Block");
            }
        }

    }
}
