package ExceptionHandling;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        try {
            int x, y;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter First Number : ");
            x = input.nextInt();
            System.out.println("Enter Second Number : ");
            y = input.nextInt();
            double result = x/y;
            System.out.println("x divided y  : "+result);
        }catch (ArithmeticException e){   // here   e  class ArithmeticException class reference .
            System.out.println("Occur an Exception : "+e);
        }
        catch (Exception e2){
            System.out.println("exception Occur : "+e2);
        }
        finally {
            System.out.println("Final execution Block");
        }
    }
}
