//WAP TO Convert String to Date  
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Task0_29 {
    public static void main(String[] args) throws ParseException{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  date (dd-MM-YY) :");
        String input = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
       System.out.println("Date : "+ sdf . parse(input));
    }
}
