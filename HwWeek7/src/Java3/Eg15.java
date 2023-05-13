package Java3;
import java.util.Scanner;

public class Eg15 {
    //15. Write a program that tells us input value is number or an alphabet orsymbol.

    public static void main(String[] args) {
        sub();

    }
    public static void sub(){
        Scanner mn = new Scanner(System.in);
        System.out.println("Enter char any number or alphabet or symbol");
        char vd = mn.next().charAt(0);

        if ((vd >= 'a' && vd<= 'z')){
        System.out.println("is A Alphabet");

        } else if ((vd >= '0' && vd<= '9')) {
            System.out.println("is A Digit");

        } else {
            System.out.println("is A Symbol");
        }

    }
}
