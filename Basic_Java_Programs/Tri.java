import java.util.*;
public class Tri {
  /**Write Java methods to calculate the area of a triangle. 

Input Side-1: 10                                                                               
Input Side-2: 15                                                                               
Input Side-3: 20    
Expected Output:                                                                          
The area of the triangle is 72.6184377413890 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter Side 1");
        a = sc.nextDouble();
        System.out.println("Enter Side 2");
        b = sc.nextDouble();
        System.out.println("Enter Side 3");
        c = sc.nextDouble();
             
        System.out.println(func(a, b, c));
        
    }

    public static double func(double a, double b , double c){
        double sp = (a + b + c) /2;
        
       return  Math.sqrt((sp) * (sp-a)*(sp-b)*(sp-c));

    }
}


