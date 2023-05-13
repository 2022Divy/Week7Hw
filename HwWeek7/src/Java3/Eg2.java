package Java3;

public class Eg2 {
    //2. Declare array and store any 5 countries and print them in console.

    static String countries[] = {"Uk", "USA", "India", "Canada", "Japan"};

    public static void main(String[] args) {
        add();
    }

    public static void add(){
        for (int i=0;i<5;i++){
            System.out.println(countries[i]);

        }

    }
}
