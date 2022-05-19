package Submitted;
import java.util.*;
public class FartoCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit :");
        float f = sc.nextInt();
        float c = (f - 32) * 5 / 9 ;

        System.out.println("The temperature in Celcius is :"+c);
    }
}
