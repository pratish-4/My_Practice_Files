import java.util.*;

public class ParaBlancing {
    public static boolean match(String parens) {
        //write your code here
        Stack <Character> sc = new Stack<>();
        if(parens.length() %2 !=0){
            return false;
        }
        else{
            for(int i = 0; i <parens.length();i++){
                char data = parens.charAt(i);
                if(data == '('){
                sc.push(data);
                }
                else{
                    if(!sc.isEmpty()){
                       char ch = sc.pop();
                        if(ch !='(' && data == ')'){
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
        Scanner in = new Scanner(System.in);
        System.out.println(match(in.nextLine()));
    }
}
