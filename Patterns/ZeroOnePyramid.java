/**
 * ZeroOnePyramid
 */
public class ZeroOnePyramid {
public static void main(String[] args) {
    int n = 10;
    int m = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            int sum = i + j ;

           if(sum % 2 ==0){
            System.out.print("1"+ " ");
           }else{
            System.out.print("0"+ " ");
           }
        }
        m++;
        System.out.println();
    }
}
}
    
