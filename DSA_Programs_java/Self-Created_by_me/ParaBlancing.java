import java.util.*;

public class ParaBlancing {
    public static boolean match(String parens) {
        //write your code here
        int len = parens.length();
        if(len % 2 !=0){
            return false;
        }
        else{
            Stack <Character> stackChar = new Stack<>();
            for (int i = 0; i <len ; i++){
                char data = parens.charAt(i);
                if(data != '(' || data !=')'){
                    return false;
                }
                else{
                if (data == '('){
                    stackChar.push(data);
                }
                else if(data == ')' && !stackChar.empty()){
                    char ck = stackChar.pop();
                    // check 
                    if(ck == '(' && data != ')'){
                        return false;
                    }
                    }
                }
                }
                return true;
            }
            
        }

    
                

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(match(in.nextLine()));
    }
}
