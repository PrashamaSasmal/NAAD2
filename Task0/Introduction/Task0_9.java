//WAP to Find the Largest among Three Numbers 
public class Task0_9 {
    public static void main(String args[]){
    
        int num1=20,num2=30,num3=40;
        System.out.println("Numbers are : "+num1+" "+num2+" "+num3);
        
        if(num1>num2&&num1>num3)
        {
            System.out.println(num1+" is largest.");
        }
        else if(num2>num1&&num2>num3)
        {
            System.out.println(num2+" is largest.");
        }
        else
        {
            System.out.println(num3+" is largest.");
        }
     
    }
    
}
