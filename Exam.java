 
/**A student will not be allowed to sit in exam if his/her attendence is less than 75%.Take following input from user Number of classes held Number of classes attended.
 *  And print percentage of class attended Is student is allowed to sit in exam or not. */
import java.util.*;
public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the total number of classes held :");
        int a = sc.nextInt();
        System.out.println("Input the total number of classes attended by the student :");
        int b = sc.nextInt();
        int c = b * 100;
        int d = c/a;
        if(d > 75){
            System.out.println("The percentage of attendance is :"+d+"%" );
            System.out.println("The student is eligible for the exam");
        } 
        else{
            System.out.println("Sorry, the student is not eligible");
        }
    }
}
