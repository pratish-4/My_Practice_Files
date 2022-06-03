import java.util.Scanner;

/**
 * SpaceInput
 */
public class SpaceInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        String [] arr = inputLine.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}