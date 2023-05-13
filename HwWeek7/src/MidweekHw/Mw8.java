package MidweekHw;

import java.util.Scanner;

public class Mw8 {
    //8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
    //Take following input from user
    //Number of classes held
    //Number of classes attended.
    //And print percentage of class attended
    //Is student is allowed to sit in exam or not.#}

    static int a,b,d;
    public static void main(String[] args) {
        atd();

    }
    public static void atd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of class held :");
        int a = sc.nextInt();

        System.out.println("Enter number of class attended :");
        int b = sc.nextInt();

        float d = 100*b/a;
        System.out.println("The percentage of attendence is:"+d+"%");

        if (a>=75){
            System.out.println("You are allow to sit in the exam");
        }
        else {
            System.out.println("You are not allow to sit in exam");
        }
    }

}
