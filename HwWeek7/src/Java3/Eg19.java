package Java3;

import java.util.Scanner;

public class Eg19 {
    //19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
    public static void main(String[] args) {
        no();

    }
    public static void no(){
        System.out.println("Enter any number");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        if (num > 0){
            System.out.println("POSITIVE");

        } else if (num < 0) {
            System.out.println("NEGATIVE");

        } else {
            System.out.println("ZERO");
        }
    }
}
