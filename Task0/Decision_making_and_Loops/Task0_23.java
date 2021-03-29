//WAP to Make a Simple Calculator using Switch Case
import java.util.Scanner;
public class Task0_23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter any operator(+,-,*,/,%) : ");
        char ch = sc.next().charAt(0);
      
        switch(ch){
            case '+':add(num1,num2);
            break;
            case '-':subtract(num1,num2);
            break;
            case '*':multiply(num1,num2);
            break;
            case '/':divide(num1,num2);
            break;
            case '%':modulo(num1,num2);
            break;
        }
    }
    public static void add(int n1, int n2){
        int ans = n1+n2;
        System.out.println(n1+" + "+n2+" = "+ ans);
    }
    public static void subtract(int n1, int n2){
        int ans = n1-n2;
        System.out.println(n1+" - "+n2+" = "+ ans);
    }
    public static void multiply(int n1, int n2){
        int ans = n1*n2;
        System.out.println(n1+" * "+n2+" = "+ ans);
    }
    public static void divide(int n1, int n2){
        int ans = n1/n2;
        System.out.println(n1+" / "+n2+" = "+ ans);
    }
    public static void modulo(int n1, int n2){
        int ans = n1%n2;
        System.out.println(n1+" % "+n2+" = "+ ans);
    }
}
