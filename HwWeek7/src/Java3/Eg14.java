package Java3;

public class Eg14 {
    //14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
    //5 separately.

    public static void main(String[] args) {
        num();

    }

    public static void num() {
        System.out.println("Divided by 5 is: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Divided by 3 is: ");
        for (int p = 1; p < 100; p++) {
            if (p % 3 == 0) {
                System.out.println(p);
            }


        }


    }
}
