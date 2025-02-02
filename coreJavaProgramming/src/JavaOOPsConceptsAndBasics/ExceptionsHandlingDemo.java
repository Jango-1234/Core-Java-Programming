package JavaOOPsConceptsAndBasics;

import java.util.Scanner;

public class ExceptionsHandlingDemo {
    public static void main(String[] args) {
        System.out.println("program is started...");
        Scanner sc = new Scanner(System.in);

        //Different Types of exceptions are --->

        //Example1  --> ArithmeticException
        /*System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(100/num);*/

        //Example2 --> ArrayIndexOutOfBoundsException
       /* int a[] = new int[5];
        System.out.println("Enter the position(0-4)");
        int pos= sc.nextInt();

        System.out.println("Enter a value");
        int value = sc.nextInt();

        a[pos]=value;
        System.out.println(a[pos]);*/

        //Example3 --> NumberFormatException
        /*String s ="welcome";
        int num = Integer.parseInt(s);
        System.out.println(num);*/

        //Example4 ---> NullPointerException
        String s = null;
        System.out.println(s.length());

        System.out.println("program is completed...");
        System.out.println("program is exited...");
    }
}
