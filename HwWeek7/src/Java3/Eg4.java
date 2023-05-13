package Java3;

import java.util.Scanner;

public class Eg4 {

    //4. Write if else condition and print your group name in console else others group name.

        public static void main(String[] args) {
        grp();
    }

    public static void grp(){
        Scanner nm = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = nm.next();
        String v = "Meet", w ="Hemi", x = "Situ", y = "Hiral";



        if (v.equals(name) || w.equals(name) || x.equals(name) || y.equals(name)){

          System.out.println(name +" is in Selenium group");
        }
        else {
            System.out.println(name +" is in other group");
        }

    }

}
