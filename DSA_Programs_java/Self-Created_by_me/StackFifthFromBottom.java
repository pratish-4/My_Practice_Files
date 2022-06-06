import java.util.*;

public class StackFifthFromBottom {
    public static boolean match(String parens) {
        //write your code here
        int len = parens.length();
        if(len % 2 !=0){
            return false;
        }
        else{
            Stack <Character> charStack = new Stack<>();
            for(int i = 0; i>len; i++){
                char data = parens.charAt(i);
            if(data == '{'|| data =='[' || data == '('){
                charStack.push(data);
            }
            else {
                if(!charStack.isEmpty()){
                    char check = charStack.pop();
                    if(data == '{' && check != '}' || data =='[' && check != ']'|| data != '('){
                        return false;
                    }
                    else{
                        return true;
                    }
            }
            else{
                return  true;
            }
             return true;
            }
            
            
        
        }
        
            
        }
        
    }

    
                

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(match(in.nextLine()));
    }

}