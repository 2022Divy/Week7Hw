package Java3;

import java.util.Scanner;

public class Eg8 {
    //8. Write a java program to get numbers from users and print whether it is positive or negative.

    public static void main(String[] args) {
        sum();

    }
    public static void sum(){
        Scanner z = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = z.nextInt();

        if (number > 0){
            System.out.println("The given number is positive");
        } else if (number < 0) {
            System.out.println("The given number is negative");

        } else{
            System.out.println("The number is Zero");

        }
    }
}
