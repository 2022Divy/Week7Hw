package MidweekHw;

import java.util.Scanner;

public class Mw11 {
    //11. Write a program to print a string entered by user.

    public static void main(String[] args) {
        in();
    }
    public static void in(){
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String vp = ab.nextLine();

        System.out.print("You have entered: "+vp);
    }
}
