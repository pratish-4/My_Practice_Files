import java.util.Scanner;



/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        
    
    Scanner read = new Scanner(System.in);
    String inp = read.nextLine();
    String rev = "";
    
    for(int i = inp.length(); i>=0;i-- ){
        rev = rev+inp.length();
        }
        System.out.println(rev);
}

}