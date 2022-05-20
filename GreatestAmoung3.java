package Submitted;
/*
Question 1: Take three input from the user and print the greatest number .

*/
import java.util.*;
public class GreatestAmoung3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first integer number :");
        int a = sc.nextInt();

        System.out.println("Input the second integer number :");
        int b = sc.nextInt();

        System.out.println("Input the third integer number :");
        int c = sc.nextInt();
        if(a > b){
            if(a > c){
            System.out.println("The greatest number is : "+a);
            }
            else{ System.out.println("The greatest number is : "+c);
        }
        }
        else if (b > a){
            if(b>c){
                System.out.println("The greatest number is : "+b);
            }
            else{System.out.println("The greatest number is : "+c);}
        }
        }
    }
    

