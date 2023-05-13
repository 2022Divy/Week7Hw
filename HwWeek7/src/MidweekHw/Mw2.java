package MidweekHw;

public class Mw2 {
    //2. Print multiplication table of 24, 50 and 29 using loop.
    public static void main(String[] args) {
        multi();

    }

    public static void multi(){
        int num = 24, num1 = 50, num2 = 29;

        for(int i =1; i<=10; i++){

            System.out.println(num+ "*" + i + "=" +num*i);

        }
        for(int i =1; i<=10; i++){
            System.out.println(num1+ "*" + i + "=" +num1*i);

        }
        for(int i =1; i<=10; i++){
            System.out.println(num2+ "*" + i + "=" +num2*i);

        }

    }
}
