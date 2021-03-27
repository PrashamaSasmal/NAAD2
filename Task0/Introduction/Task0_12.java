//WAP to Remove all White Spaces from the string
import java.util.Scanner;
public class Task0_12 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  string :");
        String input = sc.nextLine();
        input = input.replaceAll("\\s","");
        System.out.println("String after removing all white Spaces : "+input);
        sc.close(); 
    }
}
