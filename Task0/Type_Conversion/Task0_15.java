//WAP to Convert String type Variables into Int

public class Task0_15 {
    public static void main(String[] args){

    String str = "12345";
    Integer val1 = Integer.valueOf(str);//using valueOf method
    Integer val2 = Integer.parseInt(str);//using parseInt method
  
    System.out.println(val1);
    System.out.println(val2);
    
    }
}
