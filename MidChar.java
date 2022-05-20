package Submitted;
/**
 * MidChar
 * Write a Java method to display the middle character of a string. 

Note:

a) If the length of the string is odd there will be one middle character.

b) If the length of the string is even there will be two middle characters.


 */
import java.util.*;
public class MidChar {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int n = str.length();

    if(n%2==0){
        int e = (n/2)-1; //534252
        int e1 = (n/2) +1;
        System.out.println(str.substring(e,e1));
    }
    else{
        int e2 = n/2; //3
        
        System.out.println(str.charAt(e2));
    }
   
}
    
}