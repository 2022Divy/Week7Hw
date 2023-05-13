package Java3;

import java.util.Scanner;

public class Eg11 {
    //11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
    //other alphabet should be invalid entry.

    public static void main(String[] args) {
        name();

    }

    public static void name() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Alphabet between A to F");
        String z = a.next();

        if (z.equals("A")) {
            System.out.println("Ahmedabad");
        } else if (z.equals("B")) {
            System.out.println("Bombay");

        } else if (z.equals("C")) {
            System.out.println("Chandigarh");

        } else if (z.equals("D")) {
            System.out.println("Delhi");

        } else if (z.equals("E")) {
            System.out.println("Erbil");
        } else if (z.equals("F")) {
            System.out.println("France");
        } else {
            System.out.println("Please enter between A to F");
        }
    }
}
