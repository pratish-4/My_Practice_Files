import java.util.Scanner;
import java.util.Stack;

public class ParaBalancingII {
    public static boolean check(String str) {
        Stack <Character> charStack = new Stack<>();
        if(str.length() % 2 != 0){
            return false;
        }
        else {
            for(int i = 0; i <str.length();i++){
                char data = str.charAt(i);
                if(data == '(' || data == '{' || data == '['){
                    charStack.push(data);
                }
                else{
                    if(!charStack.isEmpty()){
                        char check = charStack.pop();
                    if(check != '(' && data == ')' || check != '{' && data == '}' ||check != '[' && data == ']'){
                        return false;
                        }
                        }
                        else{
                            return false;
                }
               

                }
            }
            
        }
        return true;
    }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println( check(input));
    }
}
