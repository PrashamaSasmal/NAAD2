//WAP to  Check wheather Number is Even or Odd
import java.util.Scanner;
public class Task0_7 {
    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter any integer :");
        int number=reader.nextInt();
        if(number%2==0)
        {
            System.out.println(number+" is Even.");
        }
        else
        {
            System.out.println(number+" is Odd.");
        }
        
       
    }
}
