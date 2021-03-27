//WAP to Round a Number to n Decimal Places

import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Task0_13 {
    public static void main(String[] args){
        double num = 34.246835;
        System.out.format("%.3f", num);//using format
        DecimalFormat dfm = new DecimalFormat("#.###");//using DecimalFormat class
        dfm.setRoundingMode(RoundingMode.CEILING);
        System.out.println("\n"+dfm.format(num));

    }
    
}
