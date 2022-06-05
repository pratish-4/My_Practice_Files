import java.util.Scanner;

/**
 * DetectDupPar
 */
public class DetectDupPar {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    DetectDupPar d1 = new DetectDupPar();
    d1.Findtheduplicate(input);
    }
    public void Findtheduplicate(String input) {
        int curl =0, round=0, square=0;

        for (int i = 0; i < input.length(); i++) {
           char data = input.charAt(i);
            if(data == '{'){
                curl++;
            }
            else if(data == '('){
                round++;
            }
            else if(data == '['){
                square++;
            }
        }
        if(round >1 || curl >1 || square >1){
            System.out.println("The string have duplicate brackets");
        }
        else{
            System.out.println("No duplicate brackets");
        }
    }
}
