package Java3;

import java.util.Scanner;

public class Eg10 {
     //10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
    //fined this sales
    //Commission
    //Sales amount >= 50,000 35%
    //Sales amount >= 30,000 20%
    //>= 20,000 10%
    //>= 10,000 5%
    //< 10,000 2%

    public static void main(String[] args) {
        comm();
    }
    public static void comm(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Saler id: ");
        String m = sc.next();
        System.out.println("Enter saler's name :");
        String n = sc.next();
        System.out.println("Enter sales Amount :");
        int p = sc.nextInt();
        System.out.println("Enter Salary :");
        float q = sc.nextInt();

        if (p >= 50000){
            System.out.println("The commission is :"+p*0.35);
        } else if (p >=30000 && p <50000) {
            System.out.println("The commission is :"+p*0.20);

        } else if (p >=20000 && p<30000) {
            System.out.println("The commission is :"+p*0.10);

        } else if (p>10000 && p <20000) {
            System.out.println("The commission is :"+p*0.05);

        } else if (p<0 && p>10000) {
            System.out.println("The commission is :"+p*0.02);

        }else {
            System.out.println("Please enter above zero");
        }
    }
}
