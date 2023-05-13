package MidweekHw;

import java.util.Scanner;

public class Mw4 {
    //4. Take values of length and breadth of a rectangle from user and check if it is square or not.

    public static void main(String[] args) {
        min();

    }

    public static void min() {
        Scanner nd = new Scanner(System.in);
        System.out.println("Enter the value of length :");
        float length = nd.nextFloat();

        System.out.println("Enter the value of breath :");
        float breath = nd.nextFloat();

        if (length==breath){
            System.out.println("It is a square");
        } else{
            System.out.println("It is not square");

        }




    }
}
