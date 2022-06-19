import java.util.*;

public class ParabalancingIII {

    public static boolean checkBalance(String in) {
      Stack <Character> stacky = new Stack<>();
        if(in.length() %2 != 0){
            return false;
        }

        else{
            for (int i = 0; i < in.length(); i++) {
                char input = in.charAt(i);
                if(input == '('){
                    stacky.push(input);
                }
                else if(input == ')' ){
                    if(!stacky.isEmpty()){
                        char popped = stacky.pop();
                        if(popped != '(' && input == ')'){
                            return false;
                        }
                    }
                    else{
                        return false;
                    }
                }
                else{
                    System.out.println("Invalid Input");
                }
                    }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(ParabalancingIII.checkBalance(input));
        
    }
}   
