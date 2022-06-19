/**
 * Given an input string of unknown length, write a program to check whether the string is a palindrome or not 
 * using a queue data structure. If the string comes out to be a palindrome, then print
 *  “ The given input is a palindrome.”  else print “ The given input is not a palindrome.” . 
 * Your program should take a String as input from the user.
 */

import java.util.*;
public class Source03 {

 public void checkPalindrome(String input) {
  Queue <Character> nString = new LinkedList <>();
  for(int i = 0; i <input.length();i++){ 
  if(nString.isEmpty()){
    nString.offer(input.charAt(i));
   }
   else{
    nString.offer(input.charAt(i));
    int qlen = nString.size()-1;
    for(int j = 0 ; j <qlen;j++){
        char c = nString.poll();
        nString.offer(c);
    }
   }
}
String rev = "";
for (int k = 0; k <input.length();k++){
    rev=rev+nString.poll();
}

  System.out.println(rev);
  boolean b = input.equals(rev);
  System.out.println(b);
if(b){
    System.out.println("The given input is a palindrome.");    
  }
  else{
    System.out.println("The given input is not a palindrome.");
  }
 }

public static void main(String[] args) {
  Source03 obj = new Source03();
  Scanner in = new Scanner(System.in);
  String inputString = in .nextLine();
  obj.checkPalindrome(inputString);
 }
}

