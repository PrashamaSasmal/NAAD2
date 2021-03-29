//WAP to Calculate Average using Arrays
import java.util.Scanner;
public class Task0_27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array : ");
        n = sc.nextInt();
        int[] arr  = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i = 0; i < n ;i++)
        arr[i] = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i < n ;i++){
            sum = sum + arr[i];
        }
        int avg = sum / n;
        System.out.println("Average : " + avg);


}
}
