package MidweekHw;

import java.util.Scanner;

public class Mw5 {
    //5. Take two int values from user and print greatest among them.
    public static void main(String[] args) {
        grt();

    }

    public static void grt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number :");
        int no1 = sc.nextInt();

        System.out.println("Enter 2 number :");
        int no2 = sc.nextInt();

        //System.out.println("Greatest among them are :");
        if (no1 == no2)
            System.out.println ("both are equal");
        else if (no1 > no2)
            System.out.println (no1 + " is greater");

        else
            System.out.println (no2 + " is greater");

    }
}
