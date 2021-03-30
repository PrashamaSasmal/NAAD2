//WAP to Check if two Strings are Anagrams

import java.util.Arrays;
import java.util.Scanner;
public class Task0_32 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str1 = sc.nextLine();
        System.out.println("Enter String2 :");
        String str2 = sc.nextLine();

        if(str1.length() == str2.length()){
            char[] array1 = str1.toCharArray();
            char[] array2 = str2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);

            boolean test = Arrays.equals(array1, array2);

            if(test)
            System.out.println("Strings are anagrams.");
            else
            System.out.println("Strings are not anagrams.");
        }
        else
        System.out.println("Strings are not anagrams.");
    }
}
