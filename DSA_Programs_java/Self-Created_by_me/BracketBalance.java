import java.util.Stack;
public class BracketBalance {
    public static boolean checkBalance(String brackets){
        Stack<Character> bracket = new Stack<>();
        if(brackets.length() % 2 != 0){
            return false;
        }
        else{
            for (int i = 0; i < brackets.length(); i++) {
                char ch =  brackets.charAt(i);
                if(ch =='{' || ch =='[' || ch =='(' || ch =='<'){
                    bracket.push(ch);
                }
                else{
                    if(!bracket.isEmpty()){
                        char pair = bracket.pop();
                         if((pair !='{' && ch =='}') || (pair !='[' && ch ==']') || (pair !='(' && ch ==')')|| (pair !='<' && ch =='>'))  {
                            return false;
                        }
                    }
                    else{
                        return false;
                    }
                }
            }
            if(!bracket.isEmpty()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkBalance("{[]}"));
        System.out.println(checkBalance("{[]}{{"));
        System.out.println(checkBalance("{[]"));
        System.out.println(checkBalance("][]}"));
        System.out.println(checkBalance("{()()}"));
    }
}

