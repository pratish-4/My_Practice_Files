/**
 * You are given a stack with n integers. 
 * You need to delete floor(n/2) elements from the bottom of the stack and print the remaining elements of the stack.
 * The remaining elements should be printed in the order that they are inserted into the stack.
 */

import java.util.*;

public class SourceGraded {
    
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            stack.push(s.nextInt());
        }
        deleteFirstHalf(stack);
    }

// Method to delete the first half of the elements from the bottom of the stackand print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        // Write your code here
        Stack <Integer> auxiliaryStack = new Stack<>();
        Stack <Integer> finalStack = new Stack<>();

        int lev = stack.size()/2 ;
        for (int i = 0; i < lev; i++) {
            int temp = stack.pop();
            auxiliaryStack.push(temp);
        }

        for (int j = 0; j < lev; j++) {
            int jump = auxiliaryStack.pop();
            finalStack.push(jump);
        }
        
        System.out.println(finalStack);
        
    }
}
