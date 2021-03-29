//WAP to Check Whether a Number is Palindrome or not
import java.util.Scanner;
public class Task0_22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int reverse = 0, mod = 0;
        int var = num;
        while(var!=0){
        mod = var % 10;
        reverse = reverse*10 + mod;
        var=var/10;
    }
    if(reverse==num)
    System.out.println("Number is palindrome.");
    else
    System.out.println("Number is not palindrome.");
    }
}
