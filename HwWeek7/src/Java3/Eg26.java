package Java3;

public class Eg26 {
    //26. Write a Java program to reverse a word.
    //Sample Output:
    //Input a word: dsaf
    //Reverse word: fasd

    public static void main(String[] args) {
        rev();

    }

    public static void rev() {
       String z = "Shreya";
       String rev = z.trim();
       String res = "";
       char[] ch=z.toCharArray();
       for (int i = ch.length - 1; i>=0; i--){
           res += ch[i];
        }
        System.out.println("Reverse word:" +res.trim());

    }
}

