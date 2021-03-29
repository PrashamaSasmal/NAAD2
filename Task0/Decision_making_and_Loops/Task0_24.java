//WAP to Count the Number of Vowels and Consonants in a Sentence
import java.util.Scanner;
public class Task0_24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        int vowel = 0, consonant = 0,digit = 0,whiteSpace = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            vowel++;
       
            else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            consonant++;
    
            else  if(ch>='0' && ch<='9')
            digit++;
        
            else
            whiteSpace++;
        }
        System.out.println("Vowels = "+ vowel);
        System.out.println("Consonants = "+ consonant);
        System.out.println("Digits = "+ digit);
        System.out.println("WhiteSpaces = "+ whiteSpace);
}
}