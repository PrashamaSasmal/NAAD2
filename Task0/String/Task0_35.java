//WAP to Iterate through each characters of the string.
import java.util.Scanner;
public class Task0_35 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str1 = sc.nextLine();
        System.out.println("Every character of string are : ");
        for(int i = 0; i < str1.length(); i++){
            char array = str1.charAt(i);
        
        System.out.print(array + " , ");
        }
    }
}
