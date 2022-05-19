package Submitted;
/**
 * Armstrong
 */
public class Armstrong {

    public static void main(String[] args) {


        for(int n = 1; n<500;n++){
            int c = n, rem,arm=0;
            while(c>0){
                rem = c%10;
                arm = (rem*rem*rem)+arm;
                c=c/10;
            }
            if(arm==n){
                System.out.println(n);
            }
        }
    }
}