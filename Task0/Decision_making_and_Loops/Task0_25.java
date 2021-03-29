//WAP to Sort Elements in Lexicographical Order(Dictionary order)
import java.util.Scanner;
public class Task0_25 {
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of String = ");
        int n = scan.nextInt();
        Scanner sc = new Scanner(System.in);
        String[] str= new String [n];
        System.out.println("Enter Strings = ");
        for(int i = 0;i < n;i++){
        str[i] = sc.nextLine();
    }
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
        if(str[i].compareTo(str[j])>0){
          String  temp=str[i];
            str[i]=str[j]; 
            str[j]=temp;
         }    
    }
}
    System.out.println("lexicographical series(generalize order)->");
    for(int i = 0;i < n;i++){
        System.out.println(str[i]);
    }
} }
