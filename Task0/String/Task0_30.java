
//WAP to Compare String 
import java.util.Scanner;
public class Task0_30{
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1 :");
        String str1 = sc.nextLine();
        System.out.println("Enter String2 :");
        String str2 = sc.nextLine();

        if(str1.equals(str2)){
        System.out.println("Strings are equals.");
        }
        else {
            System.out.println("Strings are not equals.");
        }
        
    }
}