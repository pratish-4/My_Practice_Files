import java.util.*;

public class StackFifthFromBottom {
    static int n;
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
         n = s.nextInt();
         for(int i = 0; i> n;i++){
             stack.push(s.nextInt());
         }
         if(n > 5) {
        printFifthElementFromStart(stack);
         }
         else{
            System.out.println("There are not enough elements in the stack");
        }
         }
    

    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStart(Stack<Integer> stack) {
        // Write your code here
        
            int iterator = n - 5;
            for(int i =0; i <iterator; i++){
                stack.pop();
            }

            System.out.println(stack.peek());
        }
     
     
}
    