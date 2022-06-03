import java.util.*;
/**
 * You are given a stack with n integers and you need to print the fifth element from the top of the stack.

Input Format
The first line contains an integer n denoting the size of stack.
The next line contains n space-separated integers denoting the elements of stack.
Output Format
Print an integer. This should be the fifth element from the top of the stack.
Note: If the number of elements in the stack is less than 5, then print “There are not enough elements in the stack”.
Sample Input 1:
12
1 2 3 4 5 6 7 8 9 10 11 12
Sample Output 1:
8
Sample Input 2:
4
1 2 3 4
Sample Output 2:
There are not enough elements in the stack
 */
class OurStack{
    int stackArray[];
     private int top = -1;
    OurStack(int length){
        stackArray = new int [length];
    }
  public void addElem(int in) {
         top++;
        stackArray [top] = in;
    }
  public void getFifth() {
      if(top > 4){
          top = top -4;
      System.out.println(stackArray[top]);;
      }
      else{
        System.out.println("There are not enough elements in the stack");
      }
    }
}
/**
 * Stack_Source01
 */
public class Stack_Source01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack length");
        int length =sc.nextInt();
        OurStack s1 = new OurStack(length);
        for (int i = 0; i < length; i++) {
            System.out.println("Enter stack elements :");
            int input = sc.nextInt();
            s1.addElem(input);
        }
        System.out.print("The fifth element from the top of the stack is : ");
        s1.getFifth();
    }
}