package Java3;

import java.util.Scanner;

public class Eg6 {
    //6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
    //HRA = basic salary 10%
    //DA = Basic salary 8%
    //TA = Basic salary 9%
    //PF= Basic salary 20%
    //Gross salary = basic salary + HRA + TA + DA –PFPrint in following format

    static int basic_salary;
    static String empID, name;

    public static void main(String[] args) {
        tax();

    }

    public static void tax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID");
        int m = sc.nextInt();

        System.out.println("Enter employee name");
        String n = sc.next();

        System.out.println("Enter employee's basic salary");
        double p = sc.nextDouble();

        double HRA = p*10/100;
        double DA = p*8/100;
        double TA = p*9/100;
        double PF = p*20/100;
        double
                Gross_salary = basic_salary + HRA + DA + TA - PF;

        System.out.println("----------------------------------");
        System.out.println("|         Salary Slip             |");
        System.out.println("|                                 |");
        System.out.println("|__                               |");
        System.out.println("|  Employee ID   : "+m +"            |");
        System.out.println("|  Employee name : "+n +"          |");
        System.out.println("|________________________________  |");
        System.out.println("|  Basic Salary  :   "+p +"       |");
        System.out.println("|   HRA 10%      :   "+HRA +"     |");
        System.out.println("|   TA 8%        :   "+TA +"      |");
        System.out.println("|   DA 9%        :   "+DA +"      |");
        System.out.println("|   PF 20%       :   "+PF +"      |");
        System.out.println("|________________________________|");
        System.out.println("|   Gross Salary :   "+Gross_salary +"     |");
        System.out.println("|________________________________|");
        System.out.println("|________________________________|");



    }


}
