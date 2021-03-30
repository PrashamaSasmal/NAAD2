// WAP to make the first letter of a String capital
import java.util.Scanner;
public class Task0_34 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str1 = sc.nextLine();
        char[] charArr = str1.toCharArray();
        boolean space = true;

        for(int i = 0; i<charArr.length; i++){
           if(Character.isLetter(charArr[i])){
               if(space){
                   charArr[i] = Character.toUpperCase(charArr[i]);
                   space = false;
               }
           }
           else
           space = true;
        }
        str1 = String.valueOf(charArr);
        System.out.println(" String after modification :" + str1);
}
}
