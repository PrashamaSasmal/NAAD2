//WAP to Differentiate String == operator and equals() method
import java.util.Scanner;
public class Task0_36 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word1 :");
        String str1 = sc.nextLine();
        System.out.println("Enter word2 :");
        String str2 = sc.nextLine();

        boolean result1 = (str1 == str2);
        boolean result2 =str1.equals(str2);
        System.out.println("Using == :"+ result1); //compare reference name only(str1, str2)
        System.out.println("Using equals() :"+ result2); //compare content of string object
    }
}
