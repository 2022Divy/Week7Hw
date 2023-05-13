package Java3;

import java.util.Scanner;

public class Eg12 {
    //12. Input any alphabet from “A" to “F” and print their city name accordingly (use switch statemewnt) ifany
    //other alphabet should be invalid entry.

    public static void main(String[] args) {
        add();

    }
    public static void add(){
        Scanner nd = new Scanner(System.in);
        System.out.println("Enter alphabet between A to F");
        String a = nd.next();

        switch (a){
            case "A" :
                System.out.println("Ahmedabad");
                break;
            case "B" :
                System.out.println("Bombay");
                break;
            case "C" :
                System.out.println("Chandigarh");
                break;
            case "D" :
                System.out.println("Delhi");
                break;
            case "E" :
                System.out.println("Erbil");
                break;
            case "F" :
                System.out.println("France");
                break;
            default:
                System.out.println("Please enter alphabet between A to F");
                break;
        }
    }
}
