//WAP to Check wheather an Alphabet is Vowel or Consonant
import java.util.Scanner;
public class Task0_8 {
    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a Character :");
        char number=reader.next().charAt(0); 
        if(number=='a'||number=='e'||number=='i'||number=='o'||number=='u'||number=='A'||number=='E'||number=='I'||number=='O'||number=='U')
        {
            System.out.println(number+" is Vowel.");
        } 
        else
        {
            System.out.println(number+" is Consonant.");
        }
       
    }
    
}
