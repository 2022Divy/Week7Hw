package MidweekHw;

import java.util.Scanner;

public class Mw7 {
    //7. Take input of age of 3 people by user and determine oldest and youngest among
    //them.

    static int no1, no2, no3, min, max;
    public static void main(String[] args) {
        age();

    }
    public static void age() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st person age :");
        int no1 = sc.nextInt();

        System.out.println("Enter 2nd person age :");
        int no2 = sc.nextInt();

        System.out.println("Enter 3rd person age :");
        int no3 = sc.nextInt();


        if (no1> no2 && no1>no3)
            System.out.println ("First person is oldest");
        else if (no2 > no1 && no2>no3)
            System.out.println ("Second person is oldest");

        else if (no3>no1 && no3>no2)
            System.out.println ("Third person is oldest");
        else {
            System.out.println("All person have equal age");
        }
        if (no1<no2 && no1<no3)
            System.out.println ("First person is youngest");
        else if (no2 < no1 && no2<no3)
            System.out.println ("Second person is youngest");

        else if (no3<no1 && no3<no2)
            System.out.println ("Third person is youngest");
        else {
            System.out.println("All person have equal age");
        }
    }
}
