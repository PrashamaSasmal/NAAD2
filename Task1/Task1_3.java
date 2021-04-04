//Task 1.2 isDirectlyProportional()

import java.util.Scanner;
public class Task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
      
        int[] a = new int[n];
        int[] b = new int[n];
        
        System.out.println("Enter values for x:");
        for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
        System.out.println("Enter values for y:");
        for(int i=0;i<n;i++)
        b[i] = sc.nextInt();
        
        boolean answer = isDirectlyProportional( a , b , n);
        
        if(answer)
        System.out.println("X and Y are directly proportional to each other.");
        else
        System.out.println("X and Y are not directly proportional to each other.");
        
    }
     public  static boolean isDirectlyProportional(int[] x , int[] y ,int n){
      
      float value = (float) x[0]/y[0];
      boolean result = true;
      float [] array = new float[n];
      for(int i = 1; i <n; i++){
      array[i] = (float) x[i]/y[i];
       
        if(value == array[i])
         result = true;
         else 
         result = false;
       }
       
   return result;
   }    
}
