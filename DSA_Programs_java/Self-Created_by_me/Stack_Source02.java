/**
 * You are given a stack with n integers and you need to print the fifth element from the bottom of the stack.

Input Format
The first line contains an integer n denoting the size of stack.
The next line contains n space-separated integers denoting the elements of stack.
Output Format
Print an integer. This should be the fifth element from the bottom of the stack.
Note: If the number of elements in the stack is less than 5, then print “There are not enough elements in the stack”.
Sample Input 1:
12
1 2 3 4 5 6 7 8 9 10 11 12
Sample Output 1:
5
Sample Input 2:
4
1 2 3 4
Sample Output 2:
There are not enough elements in the stack
 */
public class Stack_Source02 {
    
    int arr01 [];
    private int top = -1, bottom = -1;
    // Parametric Constructor 
     Stack_Source02(int leng){
        arr01 = new int [leng];
     }
    public void pushOfStack(int input) {
        if(top == arr01.length){
            System.out.println("Stack Overflow");
        }
        else{
        top++;
        arr01[top] = input;
        }
    }
    public void getBottomFive() {
        if(arr01.length >5){
            int fifthElem = bottom +4;
            System.out.println(arr01[fifthElem]);
        }
        else{
            System.out.println("There are not enough elements in the stack");
        }
    }
    public static void main(String[] args) {
        Stack_Source02 s1 = new Stack_Source02(8);
        s1.pushOfStack(824);
        s1.pushOfStack(213);
        s1.pushOfStack(231);
        s1.pushOfStack(2131);
        s1.pushOfStack(23213);
        s1.pushOfStack(23823);
        s1.pushOfStack(8213);
        s1.pushOfStack(82323);
        s1.getBottomFive();
    }
}
