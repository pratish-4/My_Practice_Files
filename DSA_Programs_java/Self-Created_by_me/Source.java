import java.util.Scanner;
import java.util.*;

public class Source{
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here
        for(int i = 0; i < data.length();i++){
            char d = data.charAt(i);
            s.push(d);
        }
        for (int i = 0; i < data.length(); i++) {
            System.out.print(s.pop());
        }
    }
}