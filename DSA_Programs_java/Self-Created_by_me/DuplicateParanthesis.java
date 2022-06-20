import java.util.*;
public class DuplicateParanthesis {
    public static String findDuplicateParenthesis(String inputString) {
        //write your code here
        Stack <Character> chrStack = new Stack<>();
         for (int i = 0; i < inputString.length(); i++) {
            char in = inputString.charAt(i);
            if(in !=')'){
               chrStack.push(in);
            }
            else{
              char top = chrStack.peek();
              chrStack.pop();
              int count = 0;
              while(top != '('){
                top = chrStack.peek();
                chrStack.pop();
                count++;
              }
              if(count==0){
                return "Input string contains duplicate parentheis";
            }
            }      
            }
            

        return "Input string does not contain duplicate parenthesis";
    }


        public static void main(String[] args){
            DuplicateParanthesis obj = new DuplicateParanthesis();
            String inputString = new String();
            Scanner in = new Scanner(System.in);
            inputString = in.nextLine();
            System.out.println(obj.findDuplicateParenthesis(inputString));

        }

    }



