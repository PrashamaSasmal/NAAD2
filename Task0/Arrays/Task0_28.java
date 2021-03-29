//WAP to Concatenate two Arrays
import java.util.Arrays;
import java.util.Scanner;
public class Task0_28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Enter the size of array1 and array2 : ");
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr1  = new int[n];
        int[] arr2  = new int[m];
        System.out.println("Enter the elements of array1 : ");
        for(int i = 0; i < n ;i++)
        arr1[i] = sc.nextInt();
        
        System.out.println("Enter the elements of array2 : ");
        for(int i = 0; i < m ;i++)
        arr2[i] = sc.nextInt();
        
        int[] result = new int[n+m];
        System.arraycopy(arr1 , 0, result ,0 , n );
        System.arraycopy(arr2 , 0, result ,n , m );
        System.out.println(Arrays.toString(result));
}}
 