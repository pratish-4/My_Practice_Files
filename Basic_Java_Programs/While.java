import java.util.Scanner;

public class While {

    public static void fun(int n) {
       int i = 0;
        while(i<n){
           if(i%2 ==0){
                System.out.println(i);
           } 
           i++;
        }
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
        fun(x);
 }  
}
