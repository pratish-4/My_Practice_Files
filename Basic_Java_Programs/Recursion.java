import java.util.Scanner;

/**
 * Recursion
 */
public class Recursion {
    public void function(int n) {
        // base case of
        if(n ==0){
            return;
        }
        System.out.println(n);
        function(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Recursion r1 = new Recursion();
        r1.function(n);
    }
}