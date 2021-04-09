//Task 1.1 modify();

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter s string = ");
      String s = scan.nextLine(); 
     
      System.out.println("Enter replacements string = ");
      String replacements = scan.nextLine(); 

      String answer =  modify( s,replacements);
      System.out.println("\n String after replacement = " + answer );
    }
      public static String modify(String s, String replacements){
       
       
         char[] charArr1 = s.toCharArray();
         char[] charArr2 = replacements .toCharArray();
         
       for(int i = 0; i < s.length(); i++){
           for(int j = 0; j < replacements.length(); j=j+2){
            if(charArr1[i]==charArr2[j])
            charArr1[i] = charArr2[j+1]; 
            }
        }
        s = String.valueOf(charArr1);
        return s;
    }
    
  }
