package Java3;

import java.util.Arrays;

public class Eg20 {
    //20. Write a Java program to sort a numeric array and a string array.

    public static void main(String[] args) {
        num();

    }
    public static void num(){
        int[] numeric_array = {2345, 2678, 1796,2872,3986};

        String[] string_array = {"Gujarati", "Hindi","English","Account", "State"};

        System.out.println("My written numeric array : "+ Arrays.toString(numeric_array));
        Arrays.sort(numeric_array);
        System.out.println("sorted numeric array :"+Arrays.toString(numeric_array));

        System.out.println("My written string array : "+ Arrays.toString(string_array));
        Arrays.sort(string_array);
        System.out.println("sorted string array :"+ Arrays.toString(string_array));


    }
}
