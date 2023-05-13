package Java3;

import java.util.Arrays;

public class Eg21 {
    //21. Write a Java program to sum values of an array.
    public static void main(String[] args) {
    sub();
    }

    public static void sub(){
        int z[] = new int[4];
        z[0] = 25;
        z[1] = 34;
        z[2] = 32;
        z[3] = 47;

        System.out.println(Arrays.stream(z).sum());

        }
    }

