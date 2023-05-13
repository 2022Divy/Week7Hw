package Java3;

import java.util.Scanner;

public class Eg13 {
    //13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
    //find addition, Subtraction, multiplication and division according to theirsymbol(using if else)

    public static void main(String[] args) {
        sym();

    }
    public static void sym(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number :");
        int no1 = sc.nextInt();

        System.out.println("Enter 2 number :");
        int no2 = sc.nextInt();

        System.out.println("Enter Symbol(+,-,/,*) :");
        String meth = sc.next();

        if (meth.equals("+")){
            int sum = no1+no2;
            System.out.println("Addition is :"+sum);
        } else if (meth.equals("-")) {
            int sub = no2-no1;
            System.out.println("Subtraction is :"+sub);

        } else if (meth.equals("*")) {
            int mult = no1 * no2;
            System.out.println("Subtraction is :" + mult);
        } else if (meth.equals("/")) {
            float div = no1 / no2;
            System.out.println("Subtraction is :" + div);
        } else {
            System.out.println("Please enter valid symbol");
        }


    }

}
