//Task 1.2 totalWeight()
import java.util.Scanner;
public class Task1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String using character from A to E :");
        String s = sc.nextLine();
        int weights[] = {1,2,3,4,5};
        int sum = totalWeight( s, weights);
        System.out.println("Sum = "+sum);
     
    }

   public static int totalWeight(String s, int[] weights){
    char[] array = s.toCharArray();
    
    int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0;
    for(int i = 0; i <s.length(); i++){
     switch(array[i]){
        case 'A':c1++;
        break;
        case 'B':c2++;
        break;
        case 'C':c3++;
        break;
        case 'D':c4++;
        break;
        case 'E':c5++;
        break;
        default:
    }
}
      return c1*weights[0] +c2*weights[1]+c3*weights[2] +c4*weights[3] +c5*weights[4];
      // System.out.println(c1+"A+"+c2+"B+"+c3+"C+"+c4+"D+"+c5+"E= "+sum);
   
   }
}
