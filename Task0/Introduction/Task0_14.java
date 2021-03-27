//WAP to Check if a String is Empty or Null
import java.util.Scanner;

public class Task0_14 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  string :");
        String input = sc.nextLine();
        
        if(input.isEmpty())
        System.out.println("String is empty.");
        
        else
        System.out.println("String is not empty or null.");
    }
}
