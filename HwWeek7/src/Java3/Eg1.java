package Java3;

import java.util.Scanner;

public class Eg1 {
    //1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
    //operator (? :)

    public static void main(String[] args) {
        Even();

    }

    public static void Even(){
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = ab.nextInt();

        String v=(a%2==0)? "Number is even" : "Number is odd";
            System.out.println(v);
        }



    }

