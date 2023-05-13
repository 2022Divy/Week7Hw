package Java3;

import java.util.Scanner;

public class Eg7 {
//7. Write a java program to input any number and find out if it’s odd or even.
public static void main(String[] args) {
    num();

}

    public static void num(){
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = m.nextInt();

        if (a % 2 == 0){
            System.out.println("The given number is Even");
        }

        else {
            System.out.println("The given number is odd");
        }

    }

}
