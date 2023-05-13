package MidweekHw;

import java.util.Scanner;

public class Mw9 {
    //9. Modify the above question to allow student to sit if he/she has medical cause. Ask
    //user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

    public static void main(String[] args) {
        cause();

    }
    public static void cause(){
        Scanner sc = new Scanner(System.in);
        System.out.println("He/She has a medical Cause(Y/N):");
        String m = sc.next();

        if (m.equals("Y")){
            System.out.println("Have a medical cause");

        } else if (m.equals("N")) {
            System.out.println("Have not any medical cause");

        }else {
            System.out.println("please enter Y/N");
        }
    }
}
