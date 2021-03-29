//WAP to Create Pyramid and Pattern
import java.util.Scanner;
public class Task0_26 {
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of row  : ");
        int row = scan.nextInt();
         for (int i = row; i >= 1; --i) {
          for (int j = 1; j <= i; ++j) {
              System.out.print("* ");
      }
      System.out.println();
    }
  }
}
 