 
import java.util.*;
/**Write a program to check whether a number or string is palindrome or not.
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Provide input to check whether palidrome or not :");
        String s = sc.nextLine(); 
        String rev = "";

        for(int i = s.length()-1;i>=0;i--){
            rev = rev +s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Your input was Palindrome");
        }
        else {
            System.out.println("Your input was not Palindrome");
        }


    }
    
}
