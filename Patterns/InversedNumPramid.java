/**
 * InversedNumPramid
 */
public class InversedNumPramid {

    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(j+" ");
            }
            m--;
            System.out.println();
        }
    }
}