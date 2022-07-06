/**
 * Piramid
 */
public class Piramid {

    public static void main(String[] args) {
        int n = 10;
        int m = 0;

        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= m; j++) {
            
                System.out.print("*"+" ");
           
               // System.out.println();
          }
          m++; 
          System.out.println();
        }
    }
}