//WAP to Implement switch statement on strings
import java.util.Scanner;
public class Task0_37 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String(java/javascript/python) :");
        String str1 = sc.nextLine();
        switch(str1){
            case "java":  System.out.println("Java is famous for enterprise application.");
            break;
            case "javascript":  System.out.println("JavaScript is a famous scripting language.");
            break;
            case "python":  System.out.println("Python is famous for AI and ML.");
            break;
            default:System.out.println("No record found.");
        } 
    }
}
