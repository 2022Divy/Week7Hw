package MidweekHw;

import java.util.Scanner;

public class Mw10 {
    //10. Write a program to print the sum of two numbers entered by user by defining your
    //own method.

    public static void main(String[] args) {
        sum();

    }
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        int z = a + b;
        System.out.println("The sum of two no. is : "+z);
    }
}
