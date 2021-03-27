//WAP to Reverse a number
import java.util.Scanner;
public class Task0_21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number= ");
        int num = sc.nextInt();
        int reverse = 0;
      
        int var = num;
        while(var!=0){
        int mod = var % 10;
        reverse = reverse*10 + mod;
       // System.out.println(mod); can use this
        var=var/10;
    }
    System.out.println("reverse of number= "+ reverse);
}
}
