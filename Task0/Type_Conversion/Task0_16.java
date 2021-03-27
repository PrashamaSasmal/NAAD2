//WAP to Convert Int type Variables to String 

public class Task0_16 {
    public static void main(String[] args){

        Integer val = 12345;
        String str1 = String.valueOf(val);//using valueOf method
        String str2 = Integer.toString(val);//using parseInt method
        String str3 = ""+val; // using String concatination operation
        String str4 = String.format("%d",val);//using format method
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        
    }
}
    
    

