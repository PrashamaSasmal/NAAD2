//WAP to Check if a String is Numeric or not
import java.util.Scanner;
public class Task0_31 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str1 = sc.nextLine();
        boolean status =true;
        try{
            Double var = Double.valueOf(str1);
          }
          catch(NumberFormatException e1){
              status = false;
          }
          if(status)
          System.out.println( str1 + " is a number.");
          else
          System.out.println( str1 + " is not a number.");

}
}

