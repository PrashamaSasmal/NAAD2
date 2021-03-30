//WAP to Check if a string contains a substring
import java.util.Scanner;
public class Task0_38 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String :");
        String str1 = sc.nextLine();
        System.out.println("Enter any sub-string1 from string:");
        String subStr1 = sc.nextLine();

        System.out.println("Enter any sub-string2 from string:");
        String subStr2 = sc.nextLine();

        boolean result1 = str1.contains(subStr1);
        if(result1)
        System.out.println(subStr1 + " is present in the string.");
        else
        System.out.println(subStr1 + " is not present in the string.");
    
        result1 = str1.contains(subStr2);
        if(result1)
        System.out.println(subStr2 + " is present in the string.");
        else
        System.out.println(subStr2 + " is not present in the string.");
    
   }
}
