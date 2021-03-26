//WAP to Find all roots of a Quardatic Equation
import java.util.Scanner;


public class Task0_10 {
    public static void main(String args[]){
        System.out.println("ax^2+bx+c=0(standard form of Quardatic Equation");
        System.out.println("Enter a,b,c :");
        
        Scanner reader=new Scanner(System.in);
        double a=reader.nextDouble();
        double b=reader.nextDouble();
        double c=reader.nextDouble();
        double determinant=b*b-4*a*c;
        double root1,root2;
        if(determinant>0)
        {
            root1=(-b+Math.sqrt(determinant))/(2*a);
            root2=(-b-Math.sqrt(determinant))/(2*a);
            System.out.println("root1 ="+root1);
            System.out.println("root2 ="+root2);
        }
        else if(determinant==0)
        {
            root1=root2=-b/(2*a);
            System.out.println("root1 ="+root1);
            System.out.println("root2 ="+root2);
        }
        else
        {
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-determinant)/(2*a);
            System.out.println("root1 ="+(float)real+"+i"+(float)imaginary);
            System.out.println("root2 ="+(float)real+"-i"+(float)imaginary);

        }
    }
    
}
