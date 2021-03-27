//WAP to Display Fabonacci Series
public class Task0_18 {
    public static void main(String[] args){
    int var = 10;
    int first = 0;
    int second = 1;
    int sum=0;
    for(int i=1;i<=var;++i){
        sum = first + second;
        first=second;
        second=sum;
    
    }
    System.out.println("Sum = "+sum);
  }
}
