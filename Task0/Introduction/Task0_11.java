//WAP to Find Frequency of Character in String
import java.util.Scanner;
public class Task0_11{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  string :");
        String input = sc.nextLine();
        System.out.println("Enter a character from the inputted string to get its frequency :");
        char ch = sc.next().charAt(0);
        int frequency=0;
        for(int i=0;i<input.length();i++){
            if(ch == input.charAt(i))
            ++frequency;
        }
        System.out.println("Frequency of "+ch+" is : "+frequency);
    }
}