/**
* SimpleInterest
Write a pseudocode, flowchart and program for finding the simple interest using the expression(SI=PNR/100). 
*/
import java.util.*;
public class SimpleInterest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Principal Amount :");
double p = sc.nextDouble();
System.out.println("Enter the number of Days :");
double n = sc.nextDouble();
double n1 = n / 365;
System.out.println("Enter Interest rate percentage per annum :");
double r = sc.nextDouble();
double si = (p * n1 * r) / 100;
System.out.println("Simple interest for the given input :"+si+"per month");
}
}