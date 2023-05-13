package Java3;

import java.util.Scanner;

public class Eg5 {
    //5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
    //marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
    //should between 0 to 100”) and find out total, percentage and result.
    //If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
    //%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format

    static int maths, science, english, total;

    static float per;

    static String result, grade;

    public static void main(String[] args) {
        mark();

    }

    public static void mark() {
        Scanner ms = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = ms.next();

        System.out.println("Enter Roll number");
        int rollNo = ms.nextInt();

        System.out.println("Enter Maths Subject Marks :");
        maths = ms.nextInt();

        if (maths >= 0 && maths <= 100) {
            System.out.println("Enter science Subject Marks :");
            science = ms.nextInt();

            System.out.println("Enter english Subject Marks :");
            english = ms.nextInt();

        } else {
            System.out.println("please enter Marks between 0 and 100");
        }
        total = maths + science + english;

        per = total / 3;

        if (per >= 35) {
            result = "pass";

            if (per >= 80) {
                grade = "A+";

            } else if (per >= 60 && per < 80) {
                grade = "A";

            } else if (per >= 50 && per < 60) {
                grade = "B";
            } else if (per >= 35 && per < 50) {
                grade = "C";
            }

        } else {
            result = "Fail";
        }

        System.out.println("----------------------------------");
        System.out.println("|                                |");
        System.out.println("|          Mark Sheet            |");
        System.out.println("|__                              |");
        System.out.println("|  Name          : "+name +"         |");
        System.out.println("|  Roll No       : "+rollNo +"            |");
        System.out.println("|________________________________|");
        System.out.println("|  Subject       :    Marks      |");
        System.out.println("|________________________________|");
        System.out.println("|   Maths        :   "+maths +"          |");
        System.out.println("|   Science      :   "+science +"          |");
        System.out.println("|   English      :   "+english +"          |");
        System.out.println("|________________________________|");
        System.out.println("|    Total       :   "+total +"         |");
        System.out.println("|________________________________|");
        System.out.println("|   Percentage   :   "+per +"        |");
        System.out.println("|   Result       :   "+result +"        |");
        System.out.println("|   Grade        :   "+grade +"          |");
        System.out.println("|________________________________|");


    }
}
