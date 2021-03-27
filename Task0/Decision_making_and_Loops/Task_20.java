//WAP to Count Number of Digit in an integer

public class Task_20 {
    public static void main(String[] args){
    int var = 12345;
    int num=var;
    int count = 0;
    while(num!=0){
        int mod = var % 10;
        count++;
        num=num/10;
    }
    System.out.println("Number of Digit = "+count);
}
}
