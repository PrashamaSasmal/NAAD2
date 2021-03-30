//WAP to Create Random Strings
import java.util.Random;
import java.util.Scanner;
public class Task0_33 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to get a random sequence:");
        String str1 = sc.nextLine();
        System.out.println("Enter the length of sequence:");
        int length = sc.nextInt();
        
        Random rand = new Random(); //create the object of random class
        
        StringBuilder sb = new StringBuilder(); //create the object of StringBuilder class

        for(int i = 0; i < length; i++){
        int index = rand.nextInt(str1.length()); //generate random index number

        char randomChar = str1.charAt(index);// get character specified by index
                        //using random index no. we generated random character from the inputted string 
        
        sb.append(randomChar); //use StringBuilder class to append all the character together
}
        String randString = sb.toString();
        System.out.print("Random string is :" + randString);
}
}