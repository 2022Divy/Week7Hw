package MidweekHw;

import java.util.Scanner;

public class Mw1 {
    //1. Take 10 integers from keyboard using loop and print their average value on the
    //screen.

    public static void main(String[] args) {
        add();

    }

    public static void add(){

        Scanner ab = new Scanner(System.in);


        int sum = 0, i, n;


        for (i=0;i<10;i++){
            System.out.println("Enter any ten numbers");
            int a = ab.nextInt();

            sum=sum+a;
        }
        int average = sum/10;
        System.out.println("The average is : " +average);

    }


}
