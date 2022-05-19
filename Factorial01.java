import java.util.Scanner;

/**
 * Factorial01
 */
public class Factorial01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }

    public static void fact(int a) {
        int f = 1, i = 1;
        
        while(i<=a){
            f = f*i;
            i++;
        }
        System.out.println(f);
    }
}